package com.yino.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yino.model.system.SysRole;
import com.yino.vo.system.AssginRoleVo;

import java.util.Map;

/**
 * ClassName: SysRoleService
 * Package: com.yino.auth.service
 * Description:
 */
public interface SysRoleService extends IService<SysRole> {
    /**
     * 根据用户获取角色数据
     * @param userId
     * @return
     */
    Map<String, Object> findRoleByAdminId(Long userId);

    /**
     * 分配角色
     * @param assginRoleVo
     */
    void doAssign(AssginRoleVo assginRoleVo);

}
