package com.mcg.exercise.enums;

import com.mcg.exercise.extension.swagger.SwaggerDisplayEnum;

/**
 * @author maocg
 * @date 2022-08-04 23:52
 */
@SwaggerDisplayEnum(index = "code", name = "desc")
public enum UserTypeEnum {
    /**
     * app
     */
    APP_User(1, "app用户"),
    WEB_USER(2, "web用户"),
    WX_APPLET_USER(3, "wx小程序用户"),
    ;
    private final int code;
    private final String desc;

    UserTypeEnum(int code, String desc) {
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
