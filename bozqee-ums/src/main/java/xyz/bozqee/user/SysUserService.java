package xyz.bozqee.user;

import xyz.bozqee.ums.user.SysUser;

public interface SysUserService {

    SysUser findByLoginUsername(String username);

    int insertSysUser(SysUser sysUser);

}
