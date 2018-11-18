package com.icy.portal.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icy.portal.jedis.CookieUtils;
import com.icy.portal.pojo.CartItem;
import com.icy.portal.pojo.NewParentCatList;
import com.icy.portal.service.CartService;
import com.icy.portal.service.CatService;
import com.icy.portal.service.ContentService;
import com.icy.portal.service.UserService;

@Controller
public class IndexController {
	@Autowired
	private ContentService contentService;

	@Autowired
	CatService catservice;

	@Autowired
	UserService user;

	@Autowired
	CartService cart;

	@RequestMapping("/index")
	public String showindex(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<Map> adlist = contentService.getContentList();

		Map map1 = adlist.get(0);

		String s1 = (String) map1.get("src");

		model.addAttribute("ad1", s1);

		Map map2 = adlist.get(1);

		String s2 = (String) map2.get("src");

		model.addAttribute("ad2", s2);

		Map map3 = adlist.get(2);

		String s3 = (String) map3.get("src");

		model.addAttribute("ad3", s3);

		Map map4 = adlist.get(3);

		String s4 = (String) map4.get("src");

		model.addAttribute("ad4", s4);

		String cat1 = catservice.getbuffer(1);
		String cat2 = catservice.getbuffer(161);
		String cat3 = catservice.getbuffer(558);
		String cat4 = catservice.getbuffer(749);
		String cat5 = catservice.getbuffer(74);
		String cat6 = catservice.getbuffer(378);

		model.addAttribute("cat1", cat1);
		model.addAttribute("cat2", cat2);
		model.addAttribute("cat3", cat3);
		model.addAttribute("cat4", cat4);
		model.addAttribute("cat5", cat5);
		model.addAttribute("cat6", cat6);

		String s = "<li class='fore1' id='loginbar' >您好！欢迎来到冰笑风云！&nbsp&nbsp  <a href='javascript:login()'>[立即登录]</a>&nbsp <a href='javascript:regist()'>[免费注册]</a></li>";
		String d;

		String token = CookieUtils.getCookie(request, "TT_TOKEN");
		if (user.getUserByToken(token) == null) {

			model.addAttribute("status", s);

		} else {
			d = "尊敬的  &nbsp" + user.getUserByToken(token).getUsername()
					+ "欢迎来到冰笑风云&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp您可以在这里&nbsp<a href=\"http://localhost:8084/page/logout.html\" class=\"link-logout\">[退出]</a>";
			model.addAttribute("status", d);
		}

		List<CartItem> itemList = cart.showItemList(request, response);
		long totalprice = 0;
		int num = 0;
		for (CartItem cartItem : itemList) {
			long price = cartItem.getPrice();
			totalprice = totalprice + price;
			num++;
		}
		if (totalprice == 0) {
			String status = "当前购物车里没有商品";
			model.addAttribute("totalprice", 0);
			model.addAttribute("cartstatus", status);
		} else {
			String status = "当前购物车有" + num + "件商品";
			model.addAttribute("totalprice", totalprice / 100);
			model.addAttribute("cartstatus", status);

		}
		model.addAttribute("totalprice", totalprice / 100);

		return "index";
	}

}
