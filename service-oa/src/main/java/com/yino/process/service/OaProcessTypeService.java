package com.yino.process.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yino.model.process.ProcessType;

import java.util.List;

/**
 * <p>
 * 审批类型 服务类
 * </p>
 *
 * @author yino
 * @since 2023-04-12
 */
public interface OaProcessTypeService extends IService<ProcessType> {

    List<ProcessType> findProcessType();
}
