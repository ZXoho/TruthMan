package com.cn.truth.service.impl;

import com.cn.truth.dataobject.UserInfo;
import com.cn.truth.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void addPoint() {
        UserInfo user = userService.addPoint("5d4xf6v46x5", 2);
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