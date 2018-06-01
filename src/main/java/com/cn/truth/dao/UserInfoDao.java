package com.cn.truth.dao;

import com.cn.truth.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfo, String> {
    UserInfo findByUserOpenid(String userOpenid);
}

