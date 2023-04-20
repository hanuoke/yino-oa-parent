package com.yino.process.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yino.model.process.ProcessRecord;

/**
 * <p>
 * 审批记录 服务类
 * </p>
 *
 * @author yino
 * @since 2023-04-14
 */
public interface OaProcessRecordService extends IService<ProcessRecord> {
     void record(Long processId , Integer status , String description);

}
