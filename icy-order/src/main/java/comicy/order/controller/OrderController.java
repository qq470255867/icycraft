package comicy.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.order.pojo.Order;
import com.icy.common.pojo.TaotaoResult;
import com.icy.common.utils.ExceptionUtil;

import comicy.order.service.OrderService;

@Controller

public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping(value="/create",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createOrder(@RequestBody Order order) {
		try {
			TaotaoResult result = orderService.createOrder(order, order.getOrderItems(), order.getOrderShipping());
			
			return result;

		} catch (Exception e) {
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
		
	}

}
