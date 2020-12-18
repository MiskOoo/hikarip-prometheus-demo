package com.ovopark.hikaricpprometheusdemo;

import com.ovopark.hikaricpprometheusdemo.bean.User;
import com.ovopark.hikaricpprometheusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HikaricpPrometheusDemoApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    void testSelectAll() {
        List<User> users = userMapper.selectAll();
        users.forEach(System.out::println);
    }

}
