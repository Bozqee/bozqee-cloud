package xyz.bozqee.user;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;
import xyz.bozqee.ums.user.SysUser;

@Mapper
public interface SysUserDao extends BaseMapper<SysUser> {

}
