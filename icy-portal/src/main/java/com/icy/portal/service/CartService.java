package com.icy.portal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icy.common.pojo.TaotaoResult;
import com.icy.portal.pojo.CartItem;

public interface CartService {
	
	TaotaoResult addCartItem(Long itemId, Integer num, 
			HttpServletRequest request, HttpServletResponse response);

	List<CartItem> showItemList(HttpServletRequest request,HttpServletResponse response);
	
	TaotaoResult deleteCartItem(Long itemId,HttpServletRequest request,HttpServletResponse response);
}
