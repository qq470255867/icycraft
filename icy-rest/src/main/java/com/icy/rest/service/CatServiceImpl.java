package com.icy.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.rest.mapper.SelectCatDao;
import com.icy.rest.pojo.CatName;
import com.icy.common.pojo.TaotaoResult;
@Service
public class CatServiceImpl implements CatService {
	
	@Autowired
	SelectCatDao selectCatDao;

	@Override
	public TaotaoResult SelectCatNameById(long id) {
		
		
		CatName names = selectCatDao.selectByid(id);
		
		return TaotaoResult.ok(names);
		
	}

}
