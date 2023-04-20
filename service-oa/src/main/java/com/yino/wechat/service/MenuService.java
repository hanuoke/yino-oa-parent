package com.yino.wechat.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yino.model.wechat.Menu;
import com.yino.vo.wechat.MenuVo;

import java.util.List;

/**
 * <p>
 * 菜单 服务类
 * </p>
 *
 * @author yino
 * @since 2023-04-14
 */
public interface MenuService extends IService<Menu> {
    //获取全部菜单
    List<MenuVo> findMenuInfo();

    //同步菜单
    void syncMenu();

    //删除菜单
    void removeMenu();


}
