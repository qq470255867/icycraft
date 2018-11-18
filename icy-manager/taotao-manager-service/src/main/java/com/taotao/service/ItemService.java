package com.icy.service;

import com.icy.common.pojo.EUDataGridResult;
import com.icy.common.pojo.TaotaoResult;
import com.icy.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long itemId);

	EUDataGridResult getItemList(int page, int rows);

	TaotaoResult createItem(TbItem tbItem, String desc,String itemParam) throws Exception;

}
