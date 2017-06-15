package com.chinasoft.planeticket.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.service.IFicketService;

@Controller
@RequestMapping("/user")
public class Ficket {
	@Resource
	private IFicketService iFicketService;
	
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public Ficket doLogin(Ficket ficket){
		System.out.println("------------------------------->alter");  
		Ficket login=iFicketService.insertFicket(ficket);
		System.out.println(login.toString());
		return login;
	}
	
}
