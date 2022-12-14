package xyz.bozqee.common.core.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import xyz.bozqee.common.core.exception.assertion.BusinessExceptionAssert;

@Getter
@AllArgsConstructor
public enum BusinessResponseEnum implements BusinessExceptionAssert {

    USER_NOT_FOUND(6001, "用户不存在"),

    ;

    /**
     * 返回码
     */
    private final int code;
    /**
     * 返回消息
     */
    private final String message;
}
