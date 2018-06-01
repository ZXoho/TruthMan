package com.cn.truth.service;

import com.cn.truth.dataobject.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /** 更新积分
     * 评论一次的 2分
     * 采纳得4分
     * 推荐得2分
     */
    UserInfo addPoint(String userOpenid, Integer point);

    /** 修改地址 */
    UserInfo addUserAddress(String userOpenid, String address);

    /** 删除地址 */
    UserInfo deleteUserAddress(String userOpenid);

    /** 查看积分 */
    Integer findUserPoint(String userOpenid);

    /** 查看地址 */
    String findUserAddress(String userOpenid);


}
