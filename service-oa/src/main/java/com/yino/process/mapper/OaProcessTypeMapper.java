package com.yino.process.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yino.model.process.ProcessType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * 审批类型 Mapper 接口
 * </p>
 *
 * @author yino
 * @since 2023-04-12
 */
@Mapper
public interface OaProcessTypeMapper extends BaseMapper<ProcessType> {

}
