package com.yino.auth.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yino.model.system.SysUser;

import java.util.Map;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author yino
 * @since 2023-03-31
 */
public interface SysUserService extends IService<SysUser> {
    void updateStatus(Long id,Integer status);

    SysUser getbyUsername(String username);

    Map<String, Object> getCurrentUser();


}
