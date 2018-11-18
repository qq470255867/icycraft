package com.icy.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.icy.rest.dao.JedisClient;
import com.icy.common.pojo.TaotaoResult;
@Service
public class RedisServiceImpl implements RedisService {
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;
	
	@Autowired
	private JedisClient jedisClient;
	

	@Override
	public TaotaoResult syncContent(Long contentCid) {
		
		try {
			
			jedisClient.hdel("INDEX_CONTENT_REDIS_KEY",contentCid+"");
			
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, com.icy.common.utils.ExceptionUtil.getStackTrace(e));
			
		}
		// TODO Auto-generated method stub
		return TaotaoResult.ok();
	}

}
