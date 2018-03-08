package com.example.springbootmybatis.common.Constanst;

public enum ErrorConst {
    EROOR1("E001","业务异常，请重试！"),
    EROOR2("E002","未知异常，请联系系统管理员！"),
    EROOR3("E003","数据库连接异常"),
    ;

    private String code;
    private String message;

    ErrorConst(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
