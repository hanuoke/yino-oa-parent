package com.yino.auth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yino.model.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author yino
 * @since 2023-03-31
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
