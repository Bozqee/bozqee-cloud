package xyz.bozqee.common.core.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import xyz.bozqee.common.core.constant.IResponseEnum;

@Getter
@AllArgsConstructor
public enum CommonResponseEnum implements IResponseEnum {

    SUCCESS(0, "SUCCESS"),
    ERROR(100, "请求失败"),

    SERVER_BUSY(-1, "服务器繁忙"),

    SERVER_ERROR(9999, "网络异常"),
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

