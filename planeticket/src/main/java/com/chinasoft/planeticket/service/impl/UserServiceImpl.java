package com.chinasoft.planeticket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.UserMapper;
import com.chinasoft.planeticket.pojo.User;
import com.chinasoft.planeticket.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Resource private UserMapper userMapper;
	
	
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}
	
}
