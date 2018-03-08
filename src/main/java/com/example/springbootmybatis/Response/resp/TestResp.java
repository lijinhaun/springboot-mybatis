package com.example.springbootmybatis.Response.resp;

import com.example.springbootmybatis.Response.AbstractResp;
import com.example.springbootmybatis.model.Test;

import java.util.List;

public class TestResp extends AbstractResp{

    private List<Test> list;

    public TestResp(List<Test> list) {
        this.list = list;
    }

    public List<Test> getList() {
        return list;
    }

    public void setList(List<Test> list) {
        this.list = list;
    }
}
