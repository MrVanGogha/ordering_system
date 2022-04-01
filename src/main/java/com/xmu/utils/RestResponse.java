package com.xmu.utils;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description:
 * @Date: Create in 17:17 2021/10/4
 */
@Getter
@Setter
public class RestResponse<T> implements Serializable {

    private static final long serialVersionUID = 1064994557075313065L;

    public static final int SUCCESS = 200;
    private int code;
    private String message;
    private T data;

    public RestResponse() {
    }

    public RestResponse(int code) {

        this.code = code;
    }

    public RestResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> RestResponse<T> success() {

        return new RestResponse(SUCCESS);
    }

    public static <T> RestResponse<T> success(T data) {

        return new RestResponse(SUCCESS, "操作成功", data);
    }

    public static RestResponse error(int code, String message) {
        return new RestResponse(code, message);
    }
}
