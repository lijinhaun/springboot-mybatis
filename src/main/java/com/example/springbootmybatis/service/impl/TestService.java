package com.example.springbootmybatis.service.impl;


import com.example.springbootmybatis.Exception.MyException;
import com.example.springbootmybatis.Response.resp.TestResp;
import com.example.springbootmybatis.common.Constanst.ErrorConst;
import com.example.springbootmybatis.common.entity.Result;
import com.example.springbootmybatis.mapper.TestMapper;
import com.example.springbootmybatis.model.Test;
import com.example.springbootmybatis.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class TestService implements Service{

    @Autowired
    @Qualifier("testMapper")
    private TestMapper testMapper;

    @Override
    public Map<String,Result> doProcess() {
        Map<String,Result> map = new HashMap<String,Result>();
        try {
            List<Test> list = testMapper.getTest();
            Result result = new Result();
            result.setCode("0000");
            result.setMessage("交易成功");
            result.setResp(new TestResp(list));
            map.put("result",result);
        }catch (MyException e){
            throw  new MyException(ErrorConst.EROOR1);
        }catch (Exception e){
            throw  new MyException(ErrorConst.EROOR2);
        }
        return map;
    }
}
