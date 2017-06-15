package com.chinasoft.planeticket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.AdmUserDao;
import com.chinasoft.planeticket.pojo.AdmUser;
import com.chinasoft.planeticket.service.AdmUserService;

@Service("admuserservice")
public class AdmUserServiceImpl implements AdmUserService{
	@Resource AdmUserDao AdmUserMapper;
	@Override
	public AdmUser queryAdmUser(AdmUser admUser) {
		// TODO Auto-generated method stub
		
		return AdmUserMapper.queryAdmUser(admUser);
	}

}
