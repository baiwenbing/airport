package com.chinasoft.planeticket.service;

import com.chinasoft.planeticket.controller.Ficket;

public interface IFicketService {
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
