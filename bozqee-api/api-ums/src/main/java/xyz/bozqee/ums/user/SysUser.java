package xyz.bozqee.ums.user;

import lombok.Getter;
import lombok.Setter;
import xyz.bozqee.common.core.domain.BaseEntity;

import javax.persistence.Table;

@Setter
@Getter
@Table(name = "SYS_USER")
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String name;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 是否可用
     */
    private Boolean enabled;


}
