package com.icy.service;

import java.util.List;

import com.icy.common.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);

}
