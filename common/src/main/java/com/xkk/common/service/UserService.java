package com.xkk.common.service;

import com.xkk.common.domin.User;

import java.util.List;

public interface UserService {
    User findUser();
    List<User> queryUserList();
}
