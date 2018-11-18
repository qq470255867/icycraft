package com.icy.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.rest.pojo.Item;
import com.icy.common.pojo.TaotaoResult;
import com.icy.mapper.TbItemMapper;
import com.icy.pojo.TbItem;
import com.icy.pojo.TbItemExample;
import com.icy.pojo.TbItemExample.Criteria;
@Service
public class CatItemListServiceImpl implements CatItemListService {

	@Autowired
	TbItemMapper itemMapper;

	@Override
	public List<TbItem> getCatItemListService(long Cid) {

		TbItemExample example = new TbItemExample();

		Criteria criteria = example.createCriteria();

		criteria.andCidEqualTo(Cid);

		List<TbItem> list = itemMapper.selectByExample(example);

		return list;
	}

}
