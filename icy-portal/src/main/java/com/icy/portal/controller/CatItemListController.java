package com.icy.portal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.common.utils.CookieUtils;
import com.icy.portal.pojo.CartItem;
import com.icy.portal.pojo.CatSelectResult;
import com.icy.portal.pojo.Item;
import com.icy.portal.service.CartService;
import com.icy.portal.service.CatItemListService;
import com.icy.portal.service.CatService;
import com.icy.portal.service.UserService;

@Controller
public class CatItemListController {

	@Autowired
	CatItemListService catItemListService;
	
	
	@Autowired 
	CatService catservice;
	
	@Autowired
	UserService user;
	
	@Autowired
	CartService cart;

	@RequestMapping("/products/{Cid}")
	public String showSelectPage(@PathVariable("Cid") Long Cid, @RequestParam(defaultValue = "1") Integer page,
			Model model,HttpServletRequest request, HttpServletResponse response) {

		CatSelectResult data = catItemListService.getCatItemList(Cid);
		
		
		String cat1 = catservice.getbuffer(1);
		String cat2 = catservice.getbuffer(161);
		String cat3 = catservice.getbuffer(558);
		String cat4 = catservice.getbuffer(749);
		String cat5 = catservice.getbuffer(74);
		String cat6 = catservice.getbuffer(378);
		
		
		model.addAttribute("cat1",cat1);
		model.addAttribute("cat2",cat2);
		model.addAttribute("cat3",cat3);
		model.addAttribute("cat4",cat4);
		model.addAttribute("cat5",cat5);
		model.addAttribute("cat6",cat6);
		
		
		String s="<li class='fore1' id='loginbar' >您好！欢迎来到冰笑风云！&nbsp&nbsp  <a href='javascript:login()'>[立即登录]</a>&nbsp <a href='javascript:regist()'>[免费注册]</a></li>";
		String d;

		String token = CookieUtils.getCookieValue(request, "TT_TOKEN");
		if (user.getUserByToken(token)==null) {
			
			model.addAttribute("status",s);
			
		}else {
			d="尊敬的  &nbsp"+user.getUserByToken(token).getUsername()+"欢迎来到冰笑风云&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp您可以在这里&nbsp<a href=\"http://localhost:8084/page/logout.html\" class=\"link-logout\">[退出]</a>";
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
		model.addAttribute("msg", data.getMsg());
		try {
						

			if (data.getList()!=null) {

				List<Item> list = data.getList();
				if (list.size() < 10) {
					model.addAttribute("itemList", list);
				} else {

					List<Item> list2 = list.subList((page - 1) * 9, page * 9);
					model.addAttribute("itemList", list2);
				}

				return "products";

			}else {
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		


		
		return "products";

	}

}
