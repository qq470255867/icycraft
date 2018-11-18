package com.icy.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.icy.rest.dao.JedisClient;
import com.icy.common.utils.JsonUtils;
import com.icy.mapper.TbContentMapper;
import com.icy.pojo.TbContent;
import com.icy.pojo.TbContentExample;
import com.icy.pojo.TbContentExample.Criteria;

@Service
public class ContentServiceimpl implements ContentService {
	@Autowired
	private TbContentMapper contentMapper;

	@Autowired
	private JedisClient jedisClient;

	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;

	@Override
	public List<TbContent> getContentList(long contentCid) {
		try {
			String result = jedisClient.hget("INDEX_CONTENT_REDIS_KEY", contentCid + "");			
			if (!org.apache.commons.lang3.StringUtils.isBlank(result)) {
				List<TbContent> relist =JsonUtils.jsonToList(result, TbContent.class);
				return relist;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 查询商品列表
		TbContentExample example = new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(contentCid);
		List<TbContent> list = contentMapper.selectByExample(example);

		// 查询结果添加缓存
		try {
			String cacheString = JsonUtils.objectToJson(list);
			jedisClient.hset("INDEX_CONTENT_REDIS_KEY", contentCid + "", cacheString);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	

}
