package com.zw.model;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-08 上午11:14
 * @Version 1.0
 */
public enum CommonError {
    SERROR("400","some error"),
    CERROR("402","common error"),
    NERROR("401","no token error");

    public String error_code;
    public String message;

    CommonError(String error_code, String message) {
        this.error_code = error_code;
        this.message = message;
    }
}
