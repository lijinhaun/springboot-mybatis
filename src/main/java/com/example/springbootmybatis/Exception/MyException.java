package com.example.springbootmybatis.Exception;


import com.example.springbootmybatis.common.Constanst.ErrorConst;

public class MyException extends  RuntimeException {

    private String code ;

    public MyException(ErrorConst errorConst){
        super(errorConst.getMessage());
        this.code = errorConst.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
