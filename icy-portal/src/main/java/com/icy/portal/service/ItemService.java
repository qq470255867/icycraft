package com.icy.portal.service;

import com.icy.portal.pojo.ItemInfo;
import com.icy.pojo.TbItemDesc;
import com.icy.pojo.TbItemParamItem;

public interface ItemService {
	
	public ItemInfo getItemInfo(long id);
	
	public TbItemDesc geTbItemDesc(long id);
	
	public TbItemParamItem getItemParam(Long id);

}
