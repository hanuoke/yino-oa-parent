package com.yino.auth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yino.model.system.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 角色菜单 Mapper 接口
 * </p>
 *
 * @author yino
 * @since 2023-04-03
 */
@Repository
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

}
