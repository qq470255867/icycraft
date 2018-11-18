package com.icy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.common.pojo.EUTreeNode;
import com.icy.mapper.TbItemCatMapper;
import com.icy.pojo.TbItemCat;
import com.icy.pojo.TbItemCatExample;

//商品分类管理
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private TbItemCatMapper itemCatMapper;

	@Override
	public List<EUTreeNode> getCatList(long parentId) {
		// TODO Auto-generated method stub
		// 根据创建查询条件
		TbItemCatExample example = new TbItemCatExample();
		com.icy.pojo.TbItemCatExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 根据条件查询
		List<EUTreeNode> resultlist = new ArrayList<>();
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		// 把列表转换成treeNodelist
		for (TbItemCat tbItemCat : list) {
			EUTreeNode node = new EUTreeNode();
			node.setId(tbItemCat.getId());
			node.setState(tbItemCat.getIsParent() ? "closed" : "open");
			node.setText(tbItemCat.getName());
			resultlist.add(node);

		}

		return resultlist;
	}

}
