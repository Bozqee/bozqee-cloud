package xyz.bozqee.ums.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.bozqee.ums.binding.SysBindingService;

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
