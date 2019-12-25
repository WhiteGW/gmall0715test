package com.atguigu.gmall0715.demo.service.Impl;

import com.atguigu.gmall0715.demo.bean.UserInfo;
import com.atguigu.gmall0715.demo.mapper.UserInfoMapper;
import com.atguigu.gmall0715.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
