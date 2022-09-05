package xyz.bozqee.ums.user;

public interface SysUserService {

    SysUser findByLoginUsername(String username);

    int insertSysUser(SysUser sysUser);

}
