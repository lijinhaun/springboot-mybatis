package com.example.springbootmybatis.common.entity;

import com.example.springbootmybatis.Response.AbstractResp;

public class Result {

    private String code;
    private String message;
    private AbstractResp resp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AbstractResp getResp() {
        return resp;
    }

    public void setResp(AbstractResp resp) {
        this.resp = resp;
    }
}
