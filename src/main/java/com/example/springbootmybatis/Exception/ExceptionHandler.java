package com.example.springbootmybatis.Exception;

import com.example.springbootmybatis.common.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Map<String,Result> exceptionHandler(Exception e){
        Result result = new Result();
       if(e instanceof  MyException){
           MyException myException = (MyException) e;
           result.setCode(myException.getCode());
           result.setMessage(myException.getMessage());
       }else{
           result.setCode("9999");
           result.setMessage(e.getMessage());
       }
       Map<String,Result> map = new HashMap<String,Result>();
       map.put("result",result);
       return map;
    }
}
