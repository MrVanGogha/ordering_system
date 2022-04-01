package com.xmu.utils;

/**
 * @Description:
 * @Date: Create in 18:14 2021/10/10
 */
public class BusinessException extends RuntimeException {
    /**
     * 错误码
     */
    private int code;

    /**
     * 错误详情
     */
    private String message;

    public BusinessException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException(ErrorCode errorCode){
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
