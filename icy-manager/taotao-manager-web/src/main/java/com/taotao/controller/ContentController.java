package com.icy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.common.pojo.EUDataGridResult;
import com.icy.common.pojo.TaotaoResult;
import com.icy.pojo.TbContent;
import com.icy.service.ContentService;

@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping("/query/list")
	@ResponseBody
	public EUDataGridResult getContentList(int page, int rows, long categoryId) {
		EUDataGridResult result = contentService.getContentBycategoryId(page, rows, categoryId);
		return result;
	}

	@RequestMapping("/save")
	@ResponseBody
	public TaotaoResult insertContent(TbContent content) {
		TaotaoResult result = contentService.insertContent(content);
		return result;

	}
	@RequestMapping("/delete")
	@ResponseBody
	public TaotaoResult deleteContentById(long ids){
		TaotaoResult result = contentService.deleteContentById(ids);
		return result;
	}

}
