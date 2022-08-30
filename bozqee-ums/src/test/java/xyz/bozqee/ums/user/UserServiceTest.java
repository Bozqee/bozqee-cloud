package xyz.bozqee.ums.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.bozqee.ums.UmsTestApplication;

public class UserServiceTest extends UmsTestApplication {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void testFindByBinding() {
        sysUserService.findByBinding("1231");
    }

}
