package com.icy.portal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.common.utils.CookieUtils;
import com.icy.portal.pojo.CartItem;
import com.icy.portal.pojo.CatName;
import com.icy.portal.pojo.ItemInfo;
import com.icy.portal.service.CartService;
import com.icy.portal.service.CatService;
import com.icy.portal.service.ItemServiceImpl;
import com.icy.portal.service.UserService;
import com.icy.pojo.TbItemDesc;
import com.icy.pojo.TbItemParamItem;

@Controller
public class ItemController {

	@Autowired
	ItemServiceImpl itemService;

	@Autowired
	CatService catService;
	
	@Autowired
	UserService user;
	
	@Autowired
	CartService cart;

	@RequestMapping("/item/{ItemId}")
	public String showPage(@PathVariable Long ItemId, Model model,HttpServletRequest request,HttpServletResponse response) {

		ItemInfo item = itemService.getItemInfo(ItemId);

		TbItemDesc desc = itemService.geTbItemDesc(ItemId);

		TbItemParamItem itemParam = itemService.getItemParam(ItemId);

		CatName catName = catService.getCatName(ItemId);
		model.addAttribute("item", item);
		model.addAttribute("catName", catName);
		model.addAttribute("itemDesc", desc);

		model.addAttribute("itemParam", itemParam);

		String cat1 = catService.getbuffer(1);
		String cat2 = catService.getbuffer(161);
		String cat3 = catService.getbuffer(558);
		String cat4 = catService.getbuffer(749);
		String cat5 = catService.getbuffer(74);
		String cat6 = catService.getbuffer(378);

		model.addAttribute("cat1", cat1);
		model.addAttribute("cat2", cat2);
		model.addAttribute("cat3", cat3);
		model.addAttribute("cat4", cat4);
		model.addAttribute("cat5", cat5);
		model.addAttribute("cat6", cat6);

		String s = "<li class='fore1' id='loginbar' >您好！欢迎来到冰笑风云！&nbsp&nbsp  <a href='javascript:login()'>[登录]</a>&nbsp <a href='javascript:regist()'>[免费注册]</a></li>";
		String d;

		String token = CookieUtils.getCookieValue(request, "TT_TOKEN");
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

		return "item";

	}

}
