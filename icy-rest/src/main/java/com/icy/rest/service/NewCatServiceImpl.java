package com.icy.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.rest.mapper.ParentCatList;
import com.icy.rest.pojo.NewParentCatList;

@Service
public class NewCatServiceImpl implements NewCatService {

	@Autowired
	ParentCatList parentCatList;

	@Override
	public List<NewParentCatList> getPcatList(long GraId) {
		
		
		List<NewParentCatList> pcatList = parentCatList.getPcatList(GraId);
		
		
		return pcatList;
	}

}
