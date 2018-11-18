package com.icy.portal.service;

import java.util.List;

import com.icy.portal.pojo.CatName;
import com.icy.portal.pojo.NewParentCatList;

public interface CatService {
	
	public CatName getCatName(long id);
	
	public String getbuffer(long id);

}
