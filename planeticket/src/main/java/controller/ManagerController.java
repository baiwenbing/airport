package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import bean.Manager;
import service.IManagerService;

@Controller
@RequestMapping("/Manager")
public class ManagerController {
	@Resource
	private IManagerService ManagerService;
	
	
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public Manager doLogin(Manager manager){
		Manager login=ManagerService.queryManager(manager);
		return login;
	}
}
