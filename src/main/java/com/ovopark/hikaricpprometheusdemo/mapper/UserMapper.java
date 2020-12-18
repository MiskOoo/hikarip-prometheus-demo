package com.ovopark.hikaricpprometheusdemo.mapper;

import com.ovopark.hikaricpprometheusdemo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectAll();
}
