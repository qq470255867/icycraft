package com.icy.portal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.icy.common.pojo.TaotaoResult;
import com.icy.common.utils.HttpClientUtil;
import com.icy.common.utils.JsonUtils;
import com.icy.portal.pojo.CatSelectResult;
import com.icy.portal.pojo.Item;
import com.icy.pojo.TbItem;

@Service
public class CatItemListServiceImpl implements CatItemListService {

	@Override
	public CatSelectResult getCatItemList(long Cid) {

		String http = HttpClientUtil.doGet("http://localhost:8081/rest/selectByCid/" + Cid);

		TaotaoResult formatToList = TaotaoResult.formatToList(http, TbItem.class);
		CatSelectResult result = new CatSelectResult();

		List<TbItem> tbItemList = (List<TbItem>) formatToList.getData();

		if (formatToList.getData() != null) {

			List<Item> itemList = new ArrayList<>();

			for (TbItem tbitem : tbItemList) {

				Item item = new Item();

				item.setId(tbitem.getId());
				item.setCategory_name(null);
				item.setImage(tbitem.getImage());
				item.setItem_desc(tbitem.getSellPoint());
				item.setPrice(tbitem.getPrice());
				item.setSell_point(tbitem.getSellPoint());
				item.setTitle(tbitem.getTitle());

				itemList.add(item);

			}

			result.setList(itemList);
			result.setMsg("没有找到想要的商品？<a href='http://localhost:8085'>试试从后台添加一个！</a>");

			return result;
		} else {
			result.setCurPage(1);
			result.setList(null);
			result.setMsg("当前页面暂时没有添加商品呢，<a href='http://localhost:8085'>试试从后台添加一个！</a>");
			
		}

		return result;
	}

}
