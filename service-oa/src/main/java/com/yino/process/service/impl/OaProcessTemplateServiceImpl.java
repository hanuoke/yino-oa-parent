package com.yino.process.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yino.model.process.ProcessTemplate;
import com.yino.model.process.ProcessType;
import com.yino.process.controller.OaProcessTemplateController;
import com.yino.process.mapper.OaProcessTemplateMapper;
import com.yino.process.service.OaProcessService;
import com.yino.process.service.OaProcessTemplateService;
import com.yino.process.service.OaProcessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 审批模板 服务实现类
 * </p>
 *
 * @author yino
 * @since 2023-04-12
 */
@Service
@SuppressWarnings({"unchecked", "rawtypes"})
public class OaProcessTemplateServiceImpl extends ServiceImpl<OaProcessTemplateMapper, ProcessTemplate> implements OaProcessTemplateService {

    @Autowired
    private OaProcessTypeService processTypeService;

    @Autowired
    private OaProcessTemplateMapper processTemplateMapper;

    @Autowired
    private OaProcessService processService;

    @Override
    public IPage<ProcessTemplate> selectPageProcessTempate(Page<ProcessTemplate> pageParam) {


        //1 调用mapper的方法实现分页查询
        Page<ProcessTemplate> processTemplatePage = baseMapper.selectPage(pageParam, null);

        //2 第一步分页查询返回分页数据，从分页数据获取列表list集合
        List<ProcessTemplate> processTemplateList = processTemplatePage.getRecords();

        //3 遍历list集合，得到每个对象的审批类型id
        for (ProcessTemplate processTemplate:processTemplateList) {
            Long processTypeId = processTemplate.getProcessTypeId();
            //得到每个对象的审批类型id
            //4 根据审批类型id，查询获取对应名称
            LambdaQueryWrapper<ProcessType> wrapper=new LambdaQueryWrapper<>();
            wrapper.eq(ProcessType::getId,processTypeId);
            ProcessType processType = processTypeService.getOne(wrapper);
            if(processType == null){
                continue;
            }
            processTemplate.setProcessTypeName(processType.getName());
        }
        return processTemplatePage;
    }

    @Override
    public void publish(Long id) {
        ProcessTemplate processTemplate = this.getById(id);
        processTemplate.setStatus(1);
        processTemplateMapper.updateById(processTemplate);
        //TODO 部署流程定义，后续完善

        if(StringUtils.isEmpty(processTemplate.getProcessDefinitionPath())){
            processService.deployByZip(processTemplate.getProcessDefinitionPath());
        }


    }
}
