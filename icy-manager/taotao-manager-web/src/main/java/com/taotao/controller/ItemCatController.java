package com.icy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.common.pojo.EUTreeNode;
import com.icy.service.ItemCatService;

@Controller
@RequestMapping("item/cat")
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;

	@RequestMapping("/list")
	@ResponseBody
	public List<EUTreeNode> getCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {

		List<EUTreeNode> list = itemCatService.getCatList(parentId);
		return list;

	}

}
