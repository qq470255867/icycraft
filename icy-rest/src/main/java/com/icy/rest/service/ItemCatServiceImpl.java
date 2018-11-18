package com.icy.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.rest.pojo.CatNode;
import com.icy.rest.pojo.CatResult;
import com.icy.mapper.TbItemCatMapper;
import com.icy.pojo.TbItemCat;
import com.icy.pojo.TbItemCatExample;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	TbItemCatMapper itemCatMapper;

	@Override
	public CatResult getItemCatList() {

		CatResult catResult = new CatResult();
		// 查询分类列表
		catResult.setData(getCatList(0));
		return catResult;
	}

	private List<?> getCatList(long parentId) {

		// 创建查询条件
		TbItemCatExample example = new TbItemCatExample();
		com.icy.pojo.TbItemCatExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		List resultList = new ArrayList<>();
		for (TbItemCat itemCat : list) {
			// 判断是否是fu结点
			if (itemCat.getIsParent()) {
				CatNode catNode = new CatNode();
				if (parentId == 0) {

					catNode.setName("<a href='/products/" + itemCat.getId() + ".html'>" + itemCat.getName() + "</a>");
				} else {
					catNode.setName(itemCat.getName());
				}
				catNode.setUrl("/products/" + itemCat.getId() +".html");
				catNode.setItem(getCatList(itemCat.getId()));

				resultList.add(catNode);

			} else {
				resultList.add("/products/" + itemCat.getId() + ".html|" + itemCat.getName());
			}

		}
		return resultList;

	}
}
