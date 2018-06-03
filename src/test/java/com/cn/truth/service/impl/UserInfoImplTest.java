package com.cn.truth.service.impl;

import com.cn.truth.dataobject.UserInfo;
import com.cn.truth.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
        UserInfo result = userService.addUser("sg4v3x65f4");
        System.out.println(result);
    }

    @Test
    public void addPoint() {
        UserInfo user = userService.addPoint("6s465vz", 2);
        System.out.println(user);
    }

    @Test
    public void indexUserAddress() {
        UserInfo user = userService.indexUserAddress("6s465vz", "电子科技大学清水河校区");
        System.out.println(user);
    }

    @Test
    public void deleteUserAddress() {
        UserInfo user = userService.deleteUserAddress("6s465vz");
        System.out.println(user);
    }

    @Test
    public void findUserPoint() {
        Integer userPoint = userService.findUserPoint("6s465vz");
        System.out.println(userPoint);
    }

    @Test
    public void findUserAddress() {
        String address = userService.findUserAddress("6s465vz");
        System.out.println(address);
    }
}