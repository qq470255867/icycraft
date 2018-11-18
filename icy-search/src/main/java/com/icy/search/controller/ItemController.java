package com.icy.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.search.service.ItemService;
import com.icy.common.pojo.TaotaoResult;



//请求的url
@Controller
@RequestMapping("/manager")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	//导入所有商品数据
	@RequestMapping("/importall")
	@ResponseBody
	public TaotaoResult importAllItem(){		
		TaotaoResult result=itemService.importAllItem();
		
		result.setMsg("导入solr库成功");
		return result;
		
	}
	

}
