package xyz.bozqee.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.bozqee.UmsTestApplication;
import xyz.bozqee.common.cache.CacheService;
import xyz.bozqee.common.core.constant.enums.BusinessResponseEnum;
import xyz.bozqee.ums.user.SysUser;

public class UserServiceTest extends UmsTestApplication {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private CacheService redisCacheService;

    @Test
    public void testFindByBinding() {
        SysUser sysUser = sysUserService.findByLoginUsername("1231");
        BusinessResponseEnum.USER_NOT_FOUND.assertNotNull(sysUser);
    }


    @Test
    public void testCache() {
        redisCacheService.delete("2324234");
    }


}
