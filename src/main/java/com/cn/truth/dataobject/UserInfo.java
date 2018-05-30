package com.cn.truth.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserInfo {

    @Id
    private String userOpenid;

    private Integer userPoint;

    private String userAddress;
}
