package com.dch.test;

import com.dch.entity.User;
import com.dch.service.UserService;

/**
 * 测试对象参数的传递:对象作为参数传递, 对象的属性值会随着方法内的改变而改变, 引用地址不会变
 */
public class ObjectParam {
    public static void main(String[] args) {
        User user = new User("tom", 10);
        UserService userService = new UserService();
        User newUser = userService.changeUser(user);
        System.out.println(user.toString());
        System.out.println(newUser.toString());
        System.out.println("原始:" + user.getName() + "===" + user.getAge());
        System.out.println("传参后:" + newUser.getName() + "===" + newUser.getAge());

    }
}
