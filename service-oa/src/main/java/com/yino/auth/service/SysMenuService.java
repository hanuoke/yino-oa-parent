package com.yino.auth.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yino.model.system.SysMenu;
import com.yino.vo.system.AssginMenuVo;
import com.yino.vo.system.RouterVo;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author yino
 * @since 2023-04-03
 */
public interface SysMenuService extends IService<SysMenu> {
    List<SysMenu> findNodes();

    void removeMenuById(Long id);

    List<SysMenu> findSysMenuByRoleId(Long roleId);

    void doAssign(AssginMenuVo assignMenuVo);

    List<RouterVo> findUserMenuListByUserId(Long userId);

    List<String> findUserPermsByUserId(Long userId);
}
