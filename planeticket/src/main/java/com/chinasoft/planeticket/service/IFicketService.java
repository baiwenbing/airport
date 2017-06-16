package com.chinasoft.planeticket.service;

import com.chinasoft.planeticket.controller.FicketController;
import com.chinasoft.planeticket.pojo.Ficket;

public interface IFicketService {
		
	/**
	 * 添加
	 * @param ficket
	 * @return
	 */
	public int insertFicket(Ficket ficket); 
	/**
	 * 查询
	 * @param ficket
	 * @return 
	 */
	Ficket queryFicket(Ficket ficket);
}
