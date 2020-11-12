package com.dch.service;

import com.dch.entity.User;

public class UserService {
    public User changeUser(User user) {
        user.setName("hahha");
        user.setAge(20);
        return user;
    }
}
