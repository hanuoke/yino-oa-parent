package com.yino.process.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yino.model.process.ProcessRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 审批记录 Mapper 接口
 * </p>
 *
 * @author yino
 * @since 2023-04-14
 */
@Mapper
public interface OaProcessRecordMapper extends BaseMapper<ProcessRecord> {

}
