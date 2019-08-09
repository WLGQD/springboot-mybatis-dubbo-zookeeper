package com.xkk.customer.controller;

import com.xkk.common.domin.User;
import com.xkk.common.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import javax.annotation.Resource;
import java.util.List;


@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        User u = userService.findUser();
        System.out.println(u);
        return u;
    }
    @GetMapping("queryUserList")
    public List<User> queryUserList(){
        System.out.println("customer -----queryUserList");
        System.out.println("开始调用provide 的方法");
        List<User> userList = userService.queryUserList();
        System.out.println("调用结束");
        return userList;
    }
}