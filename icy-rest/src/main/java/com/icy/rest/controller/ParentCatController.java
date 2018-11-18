package com.icy.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.rest.service.CatService;
import com.icy.common.pojo.TaotaoResult;

@Controller
public class ParentCatController {
	
	@Autowired
	CatService catService;

	@RequestMapping("/catgories/{id}")
	@ResponseBody
	public TaotaoResult getItemInfo(@PathVariable("id") Long id) {
		TaotaoResult catgories = catService.SelectCatNameById(id);
		return catgories;

	}

}
