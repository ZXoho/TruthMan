package com.cn.truth.service.impl;

import com.cn.truth.dao.UserInfoDao;
import com.cn.truth.dataobject.UserInfo;
import com.cn.truth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoImpl implements UserService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo addUser(String userOpenid) {
        UserInfo user = new UserInfo();
        user.setUserOpenid(userOpenid);
        UserInfo result = userInfoDao.save(user);
        return result;
    }

    @Override
    public UserInfo addPoint(String userOpenid, Integer point) {
        UserInfo user = userInfoDao.findByUserOpenid(userOpenid);
        Integer newPoint = user.getUserPoint() + point;
        user.setUserPoint(newPoint);
        UserInfo result = userInfoDao.save(user);
        return result;
    }

    @Override
    public UserInfo indexUserAddress(String userOpenid, String address) {
        UserInfo user = userInfoDao.findByUserOpenid(userOpenid);
        user.setUserAddress(address);
        UserInfo result = userInfoDao.save(user);
        return result;
    }

    @Override
    public UserInfo deleteUserAddress(String userOpenid) {
        UserInfo user = userInfoDao.findByUserOpenid(userOpenid);
        user.setUserAddress(null);
        UserInfo result = userInfoDao.save(user);
        return result;
    }

    @Override
    public Integer findUserPoint(String userOpenid) {
        UserInfo user = userInfoDao.findByUserOpenid(userOpenid);
        Integer userPoint = user.getUserPoint();
        return userPoint;
    }

    @Override
    public String findUserAddress(String userOpenid) {
        UserInfo user = userInfoDao.findByUserOpenid(userOpenid);
        String address = user.getUserAddress();
        return address;
    }


}
