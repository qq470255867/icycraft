package com.icy.rest.service;

import com.icy.common.pojo.TaotaoResult;

public interface RedisService {
	TaotaoResult syncContent(Long contentCid);

}
