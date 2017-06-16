package com.chinasoft.planeticket.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.service.IFicketService;

@Controller
@RequestMapping("/ficket")
public class FicketController {
	@Resource
	private IFicketService iFicketService;
	
	
	@RequestMapping("/queryFicket")
	@ResponseBody
	public Ficket doLogin(Ficket ficket){
		Ficket query=iFicketService.queryFicket(ficket);
		return query;
	}
	
	
	/**
	 * 添加跳转
	 * @return
	 */
	@RequestMapping("/inser")
	public String Insert(){
		System.out.println("++++++");
		return "FicketView";
	}
	
	@RequestMapping("/insertFicket")
	@ResponseBody
	public Ficket insertFicket(Ficket ficket){
		int insert=iFicketService.insertFicket(ficket);
		System.out.println(insert);
		return ficket;
	} 
	
}
