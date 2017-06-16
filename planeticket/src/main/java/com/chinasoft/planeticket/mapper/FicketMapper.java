package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.Ficket;

public interface FicketMapper {
	/**
	 * 添加
	 * @param ficket
	 * @return
	 */
	public int insertFicket(Ficket ficket); 
	/**
	 * 删除
	 * @param ficket
	 * @return
	 */
	Ficket deleteFicket(Ficket ficket);
	/**
	 * 查询
	 * @param ficket
	 * @return
	 */
	public List<Ficket> findAllFicket();
	public List<Ficket> selectFicket(String ficket); 
}	
