package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.Ficket;

public interface IFicketService {
		
	/**
	 * 查询
	 * @param ficket
	 * @return 
	 */
	public List<Ficket> findAllFicket();
	public List<Ficket> selectFicket(String ficket); 
	
	/**
	 * 添加
	 * @param ficket
	 * @return
	 */
	public boolean insertFicket(Ficket ficket); 
	
}
