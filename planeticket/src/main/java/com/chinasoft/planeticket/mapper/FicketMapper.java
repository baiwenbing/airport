package com.chinasoft.planeticket.mapper;

import com.chinasoft.planeticket.controller.Ficket;

public interface FicketMapper {
	/**
	 * 添加
	 * @param ficket
	 * @return
	 */
	Ficket insertFicket(Ficket ficket); 
	/**
	 * 删除
	 * @param ficket
	 * @return
	 */
	Ficket deleteFicket(Ficket ficket);
}	
