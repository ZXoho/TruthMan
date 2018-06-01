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
    public UserInfo addPoint(String userOpenid, Integer point) {
        UserInfo user = userInfoDao.findByUserOpenid(userOpenid);
        Integer newPoint = user.getUserPoint() + point;
        user.setUserPoint(newPoint);
        UserInfo result = userInfoDao.save(user);
        return result;
    }

    @Override
    public UserInfo addUserAddress(String userOpenid, String address) {
        return null;
    }

    @Override
    public UserInfo deleteUserAddress(String userOpenid) {
        return null;
    }

    @Override
    public Integer findUserPoint(String userOpenid) {
        return null;
    }

    @Override
    public String findUserAddress(String userOpenid) {
        return null;
    }
}
