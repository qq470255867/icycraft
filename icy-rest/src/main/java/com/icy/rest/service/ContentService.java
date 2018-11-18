package com.icy.rest.service;

import java.util.List;

import com.icy.pojo.TbContent;

public interface ContentService {
	List<TbContent> getContentList(long contentCid);

}
