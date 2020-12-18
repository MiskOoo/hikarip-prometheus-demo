package com.ovopark.hikaricpprometheusdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ovopark.hikaricpprometheusdemo.bean.User;
import com.ovopark.hikaricpprometheusdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.WebEndpoint;
import java.util.List;

@Component
@RestControllerEndpoint(id = "test")
public class TestController {

    public static int i = 1;
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/Hikar")
    public String testHikar(){
        System.out.println("进行第" + i + "次查询...");
        List<User> users = userMapper.selectAll();
        System.out.println("查询结果...."+users.toString());
        i++;
        return "进入test";
    }
}
