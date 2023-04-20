package com.yino.process.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yino.auth.service.SysUserService;
import com.yino.model.process.ProcessRecord;
import com.yino.model.system.SysUser;
import com.yino.process.mapper.OaProcessRecordMapper;
import com.yino.process.service.OaProcessRecordService;
import com.yino.security.custom.LoginUserInfoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 审批记录 服务实现类
 * </p>
 *
 * @author yino
 * @since 2023-04-14
 */
@Service
public class OaProcessRecordServiceImpl extends ServiceImpl<OaProcessRecordMapper, ProcessRecord> implements OaProcessRecordService {

    @Autowired
    private OaProcessRecordMapper processRecordMapper;

    @Autowired
    private SysUserService sysUserService;

    @Override
    public void record(Long processId, Integer status, String description) {
        SysUser sysUser = sysUserService.getById(LoginUserInfoHelper.getUserId());
        ProcessRecord processRecord=new ProcessRecord();
        processRecord.setProcessId(processId);
        processRecord.setStatus(status);
        processRecord.setDescription(description);
        processRecord.setOperateUserId(sysUser.getId());
        processRecord.setOperateUser(sysUser.getName());
        processRecordMapper.insert(processRecord);
    }


}
