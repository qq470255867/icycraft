package com.icy.portal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icy.common.utils.CookieUtils;
import com.icy.portal.pojo.CartItem;
import com.icy.portal.pojo.Order;
import com.icy.portal.service.CartService;
import com.icy.portal.service.OrderService;
import com.icy.portal.service.UserService;
import com.icy.pojo.TbUser;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	CartService cartService;
	
	@Autowired
	OrderService orderservice;
	
	@Autowired
	UserService userr;
	
	@Autowired
	CartService cart;
	

	@RequestMapping("/order-cart")
	String showOrderCart(HttpServletResponse response, HttpServletRequest request, Model model) {
		// 取购物车商品列表
		List<CartItem> list = cartService.showItemList(request, response);
		// 传递给页面
		model.addAttribute("cartList", list);
		

		String s="<li class='fore1' id='loginbar'> 您好！欢迎来到冰笑风云！&nbsp&nbsp  <a href='javascript:login()'>[登录]</a>&nbsp <a href='javascript:regist()'>[免费注册]</a></li>";
		String d;

		String token = CookieUtils.getCookieValue(request, "TT_TOKEN");
		if (userr.getUserByToken(token)==null) {
			
			model.addAttribute("status",s);
			
		}else {
			d="尊敬的  &nbsp"+userr.getUserByToken(token).getUsername()+"欢迎来到冰笑风云&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp您可以在这里&nbsp<a href=\"http://localhost:8084/page/logout.html\" class=\"link-logout\">[退出]</a>";
			model.addAttribute("status",d);
		}
		
		List<CartItem> itemList = cart.showItemList(request, response);
		long totalprice = 0;
		int num=0;
		for (CartItem cartItem : itemList) {
			long price = cartItem.getPrice();
			totalprice=totalprice+price;
			num++;
		}
		if (totalprice==0) {
			String status = "当前购物车里没有商品";
			model.addAttribute("totalprice", 0);
			model.addAttribute("cartstatus", status);
		}else {
			String status = "当前购物车有"+num+"件商品";
			model.addAttribute("totalprice", totalprice/100);
			model.addAttribute("cartstatus", status);
			
		}
		model.addAttribute("totalprice", totalprice/100);

		return "order-cart";
	}
	@RequestMapping("/create")
	public String orderSuccess(Order order , Model model,HttpServletRequest request,HttpServletResponse response){
		
		TbUser user = (TbUser) request.getAttribute("user");
		
		order.setUserId(user.getId());
		order.setBuyerNick(user.getUsername());
		
		String orderId = orderservice.createOrder(order);
		
		model.addAttribute("orderId", orderId);
		model.addAttribute("payment", order.getPayment());
		model.addAttribute("date", new DateTime().plusDays(3).toString("yyyy-MM-dd"));
		

		String s="<li class='fore1' id='loginbar' 您好！欢迎来到冰笑风云！&nbsp&nbsp  <a href='javascript:login()'>[登录]</a>&nbsp <a href='javascript:regist()'>[免费注册]</a></li>";
		String d;

		String token = CookieUtils.getCookieValue(request, "TT_TOKEN");
		if (userr.getUserByToken(token)==null) {
			
			model.addAttribute("status",s);
			
		}else {
			d="尊敬的  &nbsp"+userr.getUserByToken(token).getUsername()+"欢迎来到冰笑风云&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp您可以在这里&nbsp<a href=\"http://localhost:8084/page/logout.html\" class=\"link-logout\">[退出]</a>";
			model.addAttribute("status",d);
		}
		
		List<CartItem> itemList = cart.showItemList(request, response);
		long totalprice = 0;
		int num=0;
		for (CartItem cartItem : itemList) {
			long price = cartItem.getPrice();
			totalprice=totalprice+price;
			num++;
		}
		if (totalprice==0) {
			String status = "当前购物车里没有商品";
			model.addAttribute("totalprice", 0);
			model.addAttribute("cartstatus", status);
		}else {
			String status = "当前购物车有"+num+"件商品";
			model.addAttribute("totalprice", totalprice/100);
			model.addAttribute("cartstatus", status);
			
		}
		model.addAttribute("totalprice", totalprice/100);
		
		
		
		return "success";
	}
	

}
