package com.icy.order.pojo;

import java.util.List;

import com.icy.pojo.TbOrder;
import com.icy.pojo.TbOrderItem;
import com.icy.pojo.TbOrderShipping;

public class Order extends TbOrder {
	
	private List<TbOrderItem> orderItems;
	private TbOrderShipping orderShipping;
	
	public List<TbOrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<TbOrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public TbOrderShipping getOrderShipping() {
		return orderShipping;
	}
	public void setOrderShipping(TbOrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}

}
