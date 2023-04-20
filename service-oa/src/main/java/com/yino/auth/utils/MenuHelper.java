package com.yino.auth.utils;

import com.yino.model.system.SysMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MenuHelper
 * Package: com.yino.auth.utils
 * Description:
 */
public class MenuHelper {


    public static List<SysMenu> buildTree(List<SysMenu> sysMenuList) {
        List<SysMenu> trees =new ArrayList<>();

        for(SysMenu sysMenu:sysMenuList){
            //递归找到入口
            //parentId=0是入口
            if(sysMenu.getParentId().longValue()==0){
                trees.add(getChildren(sysMenu,sysMenuList));
            }
        }
        return trees;
    }

    public static SysMenu getChildren(SysMenu sysMenu ,List<SysMenu> sysMenuList){
            sysMenu.setChildren(new ArrayList<SysMenu>());

            for (SysMenu it:sysMenuList){

                if(sysMenu.getId().longValue()==it.getParentId().longValue()){
                    if(sysMenu.getChildren()==null){
                        sysMenu.setChildren(new ArrayList<SysMenu>());
                    }
                    sysMenu.getChildren().add(getChildren(it,sysMenuList));
                }
            }
            return  sysMenu;
    }
}
