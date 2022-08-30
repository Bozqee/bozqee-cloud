package xyz.bozqee.ums.account;

import lombok.Getter;
import lombok.Setter;
import xyz.bozqee.common.core.domain.BaseEntity;

@Getter
@Setter
public class SysAccount extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 密码
     */
    private String passport;


}
