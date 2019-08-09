package com.xkk.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xkk.common.domin.User;
import com.xkk.common.service.UserService;
import com.xkk.provide.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0.0")
public class UserImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        User u = userMapper.getOne(1L);
        return u;
    }

    @Override
    public List<User> queryUserList() {
        List<User> userList = userMapper.getAll();
        System.out.println("provide - querylist");
        return userList;
    }
}
