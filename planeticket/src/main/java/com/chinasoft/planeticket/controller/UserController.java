package com.chinasoft.planeticket.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.User;
import com.chinasoft.planeticket.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource private UserService userService;
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public User insertUser(User user){
		int insertuser=userService.insertUser(user);
		System.out.println(insertuser);
		return user;
		
	}
}
