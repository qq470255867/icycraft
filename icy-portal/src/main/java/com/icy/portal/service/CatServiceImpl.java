package com.icy.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.icy.common.pojo.TaotaoResult;
import com.icy.common.utils.HttpClientUtil;
import com.icy.portal.pojo.CatName;
import com.icy.portal.pojo.NewParentCatList;
@Service
public class CatServiceImpl implements CatService {
	
	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;

	@Override
	public CatName getCatName(long id) {
		//http://localhost:8081/rest/catgories/816753
		
	    String httpResult = HttpClientUtil.doGet(REST_BASE_URL+"/catgories/"+id);
		
	    TaotaoResult formatToPojo = TaotaoResult.formatToPojo(httpResult, CatName.class);

	    CatName data = (CatName) formatToPojo.getData();

		return data;
	    
	
	}

	@Override
	public String getbuffer(long id) {
		
		String httpResult = HttpClientUtil.doGet("http://localhost:8081/rest/PCat/"+id);
		


		return httpResult;
	}

}
