package com.icy.service;

import com.icy.common.pojo.EUDataGridResult;
import com.icy.common.pojo.TaotaoResult;
import com.icy.pojo.TbItemParam;

public interface ItemParamService {
	TaotaoResult getItemParamByCid(long cid);
	
	TaotaoResult insertItemParam(TbItemParam tbItemParam);
	
	EUDataGridResult getItemParamList(int page, int rows);
	

}
