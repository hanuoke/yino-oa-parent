package com.yino.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yino.model.system.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ClassName: SysUserRoleMapper
 * Package: com.yino.auth.mapper
 * Description:
 */
@Repository
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

}
