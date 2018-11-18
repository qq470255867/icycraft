package com.icy.service;

import com.icy.common.pojo.EUDataGridResult;
import com.icy.common.pojo.TaotaoResult;
import com.icy.pojo.TbContent;

public interface ContentService {
	
	EUDataGridResult getContentBycategoryId(int page,int rows,long categoryId);
	
	TaotaoResult insertContent(TbContent content);
	
	TaotaoResult deleteContentById(long ids);

}
