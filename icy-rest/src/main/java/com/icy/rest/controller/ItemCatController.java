package com.icy.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.rest.pojo.CatResult;
import com.icy.rest.service.ItemCatService;
import com.icy.common.utils.JsonUtils;

@Controller
public class ItemCatController {

	@Autowired
	ItemCatService itemCatService;

	@RequestMapping(value="/itemcat/list",
			produces=MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
	@ResponseBody
	public String getItemcatList(String callback) {

		CatResult catResult = itemCatService.getItemCatList();
		// 把pojo转换成字符串
		String json = JsonUtils.objectToJson(catResult);
		String result = callback + "(" + json + ");";
		return result;
	}

}
