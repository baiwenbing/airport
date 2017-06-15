package com.chinasoft.planeticket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.controller.Ficket;
import com.chinasoft.planeticket.mapper.FicketMapper;
import com.chinasoft.planeticket.service.IFicketService;

@Service("ficketServiceImpl")
public class FicketServiceImpl  implements IFicketService{

		@Resource
		private FicketMapper focketMapper;
/**
 * 添加
 */
		@Override
		public Ficket insertFicket(Ficket ficket) {
			// TODO Auto-generated method stub
			return focketMapper.insertFicket(ficket);
		}
/**
 * 删除
 */
		@Override
		public Ficket deleteFicket(Ficket ficket) {
			// TODO Auto-generated method stub
			return focketMapper.deleteFicket(ficket);
		} 
	
	
	
}
