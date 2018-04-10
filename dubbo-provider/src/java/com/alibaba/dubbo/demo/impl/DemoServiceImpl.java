package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions() {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d",1));
        demo.add(String.format("Permission_%d",2));
        demo.add(String.format("Permission_%d",3));
        return demo;
    }
}
