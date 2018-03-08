package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.common.entity.Result;
import com.example.springbootmybatis.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    @Qualifier("testService")
    private Service service;
    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public Map<String,Result> test(){

        Map<String,Result> map = service.doProcess();

        return map;
    }
}

