package com.yino.process.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yino.model.process.ProcessTemplate;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 审批模板 Mapper 接口
 * </p>
 *
 * @author yino
 * @since 2023-04-12
 */
@Mapper
public interface OaProcessTemplateMapper extends BaseMapper<ProcessTemplate> {

}
