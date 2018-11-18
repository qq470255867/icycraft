package com.icy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.common.pojo.EUDataGridResult;
import com.icy.common.pojo.TaotaoResult;
import com.icy.pojo.TbItem;
import com.icy.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem geTbItemById(@PathVariable long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}

	@RequestMapping("/item/list") // 和前端提供url对应
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}

	@RequestMapping(value = "/item/save", method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createItem(TbItem tbItem,String desc,String itemParams) throws Exception {

		TaotaoResult icyResult = itemService.createItem(tbItem,desc,itemParams);
		return icyResult;

	}

}
