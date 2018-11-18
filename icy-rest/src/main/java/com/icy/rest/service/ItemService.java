package com.icy.rest.service;

import com.icy.common.pojo.TaotaoResult;

public interface ItemService {
	
	public TaotaoResult getItemInfo(long  id);
	
	public TaotaoResult getItemDesc(long id);
	
	public TaotaoResult getItemParam(long id);

}
