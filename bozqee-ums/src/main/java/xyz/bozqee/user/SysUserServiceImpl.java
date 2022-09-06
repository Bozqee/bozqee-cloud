package xyz.bozqee.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.bozqee.binding.SysBindingService;
import xyz.bozqee.ums.user.SysUser;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysBindingService sysBindingService;

    @Override
    public SysUser findByLoginUsername(String username) {
        // sysBindingService.findByBindValue()

        return sysUserDao.selectOne(null);
    }

    @Override
    public int insertSysUser(SysUser sysUser) {
        return 0;
    }

}
