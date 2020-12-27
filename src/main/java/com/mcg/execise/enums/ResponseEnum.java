package com.mcg.execise.enums;

/**
 * @author mao
 * Date：2020/12/27
 * Description：请求返回统一状态码
 */
public enum ResponseEnum {
    SUCCESS(0, "SUCCESS"),
    NOT_FOUNd(404, "请求地址不存在"),
    AUTHOR_ERROR(1000, "无此权限"),
    PARAM_ERROR(2000, "参数错误"),
    UNKNOWN_ERROR(3000, "系统错误"),
    BUSINESS_ERROR(4000, "业务执行异常"),
    ;

    private final int code;
    private final String desc;

    ResponseEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
