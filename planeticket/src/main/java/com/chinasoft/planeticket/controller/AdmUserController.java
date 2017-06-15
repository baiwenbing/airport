package com.chinasoft.planeticket.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasoft.planeticket.pojo.AdmUser;
import com.chinasoft.planeticket.service.AdmUserService;


@Controller
@RequestMapping("/admUser")
public class AdmUserController {
	@Resource
	private AdmUserService admUserService;
	
	 
	@RequestMapping("/loginadmUser")
	public AdmUser loginadmUser(AdmUser admUser){
		AdmUser loginadm=admUserService.queryAdmUser(admUser);
		return loginadm;
		
	}
}
