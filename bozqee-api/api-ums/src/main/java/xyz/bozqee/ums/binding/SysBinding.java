package xyz.bozqee.ums.binding;

import lombok.Getter;
import lombok.Setter;
import xyz.bozqee.common.core.domain.BaseEntity;

@Getter
@Setter
public class SysBinding extends BaseEntity {

    /**
     * 用户id
     */
    private Long userId;
    /**
     * 登录名
     */
    private String bindValue;
    /**
     * 登录名类型
     */
    private SysBindType bindType;

}
