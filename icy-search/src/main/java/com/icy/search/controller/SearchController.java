package com.icy.search.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.search.pojo.SearchResult;
import com.icy.search.service.SearchService;
import com.icy.common.pojo.TaotaoResult;

@Controller
public class SearchController {

	@Autowired
	private SearchService service;

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	private TaotaoResult search(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "60") Integer rows, @RequestParam("q") String queryString) {
		if (StringUtils.isBlank(queryString)) {

			return TaotaoResult.build(400, "查询条件不能为空");
		}
		SearchResult result = null;
		try {
			queryString = new String(queryString.getBytes("iso8859-1"), "utf-8");
			result = service.search(queryString, page, rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return TaotaoResult.ok(result);

	}

}
