package com.icy.service;

import java.util.List;

import com.icy.common.pojo.EUTreeNode;
import com.icy.common.pojo.TaotaoResult;

public interface ContentCatgoryService {

	List<EUTreeNode> getContentCatgory(long parentId);

	TaotaoResult insertContentCatgory(long parentId, String name);

}
