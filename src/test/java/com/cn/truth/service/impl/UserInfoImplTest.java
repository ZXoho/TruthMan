package com.cn.truth.service.impl;

import com.cn.truth.dataobject.UserInfo;
import com.cn.truth.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserInfoImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void addPoint() {
        UserInfo user = userService.addPoint("kjahoilcupo", 2);
        System.out.println(user);
    }

    @Test
    public void addUserAddress() {
    }

    @Test
    public void deleteUserAddress() {
    }

    @Test
    public void findUserPoint() {
    }

    @Test
    public void findUserAddress() {
    }
}