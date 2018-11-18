package com.icy.rest.mapper;

import java.util.List;

import com.icy.rest.pojo.NewParentCatList;

public interface ParentCatList {
	
	List<NewParentCatList> getPcatList(long GraId);

}
