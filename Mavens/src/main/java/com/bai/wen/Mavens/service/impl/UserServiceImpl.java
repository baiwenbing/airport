package com.bai.wen.Mavens.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bai.wen.Mavens.bean.User;
import com.bai.wen.Mavens.dao.IUserDao;
import com.bai.wen.Mavens.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userMapper;
	
	@Override
	public User queryUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.queryUser(user);
	}


}
