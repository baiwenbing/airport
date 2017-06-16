package com.chinasoft.planeticket.controller;

import java.util.List;

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
	
	
	@RequestMapping("/findFicke")
	@ResponseBody
	public String findFicke(Ficket ficket){
		List<Ficket> find=iFicketService.findAllFicket();
		 ficketAll=find;
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
