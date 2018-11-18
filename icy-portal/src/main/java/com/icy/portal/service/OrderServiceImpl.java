package com.icy.portal.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.icy.common.pojo.TaotaoResult;
import com.icy.common.utils.HttpClientUtil;
import com.icy.common.utils.JsonUtils;
import com.icy.portal.pojo.Order;
@Service
public class OrderServiceImpl implements OrderService {

	@Value("${ORDER_BASE_URL}")
	private String ORDER_BASE_URL;
	@Value("${ORDER__CREATE_URL}")
	private String ORDER__CREATE_URL;

	@Override
	public String createOrder(Order order) {
		String json = HttpClientUtil.doPostJson(ORDER_BASE_URL + ORDER__CREATE_URL, JsonUtils.objectToJson(order));

		TaotaoResult result = TaotaoResult.format(json);
		if (result.getStatus() == 200) {
			Object orderId = result.getData();
			return orderId.toString();
		}

		return "";
	}

}
