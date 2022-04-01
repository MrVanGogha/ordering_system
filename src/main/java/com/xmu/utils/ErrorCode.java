package com.xmu.utils;

/**
 * @Description:
 * @Author: ove
 * @Email: Mr_VanGogh@yeah.net
 * @Date: Create in 18:15 2021/10/10
 */
public enum ErrorCode {

    SYSTEM_ERROR(-1, "系统异常"),
    PARAMETER_ERROR(-2, "参数异常"),
    LOGIN_NAME_PASSWORD_EMPTY_ERROR(-3,"用户名或密码参数为空"),
    User_IS_NOT_EXISTS(-4,"用户不存在"),
    PASSWORD_ERROR(-5,"用户密码错误"),
    USER_NAME_ALREADY_EXISTS(-6,"用户名已存在"),
    HOSPITAL_EXISTS_DOCTOR(-7,"医院下面有医生信息,不允许删除"),
    ;


    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
