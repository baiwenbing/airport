package com.chinasoft.planeticket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.chinasoft.planeticket.mapper.FicketMapper;
import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.service.IFicketService;
@Service("ficketServiceImpl")
public class FicketServiceImpl implements IFicketService{
	
	@Resource FicketMapper ficketMapper;

	@Override
	public Ficket queryFicket(Ficket ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.queryFicket(ficket);
	}

	@Override
	public int insertFicket(Ficket ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.insertFicket(ficket);
	}









}
