package com.atguigu.gmall0715.demo.service;

import com.atguigu.gmall0715.demo.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    /**
     * 获取用户全部信息
     * @return
     */
    List<UserInfo> findAll();

}
