package com.icy.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icy.rest.pojo.NewParentCatList;
import com.icy.rest.service.NewCatService;
import com.icy.common.pojo.TaotaoResult;

@Controller
public class NewCatController {
	
	
	@Autowired
	NewCatService CatService;
	
	
	@RequestMapping(value="/PCat/{GraId}",produces=MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
	@ResponseBody
	public String Pcat(@PathVariable long GraId){
		
		StringBuffer buffer = new StringBuffer();

		//String a = "<li class='level1 parent'> <a href='http://localhost:8081/rest/selectByCid/"+parcat.getPid()+"'>"+parcat.getPcatname()+"</span> </a>";
		//String a = "<li class='level2'> <a href='http://localhost:8081/rest/selectByCid/"+catlist.getPid()+"'>"+catlist.getPcatname()+"</span> </a>";
		
		List<NewParentCatList> Plist = CatService.getPcatList(GraId);		
		
		
		for (NewParentCatList pracat : Plist) {
			long id = pracat.getPid();
			String a = "<li class='level1 parent'> <a href='http://localhost:8082/products/"+pracat.getPid()+".html'>"+pracat.getPcatname()+"</span> </a>";
			buffer.append("<ul class='level1'>");
			buffer.append(a);
			List<NewParentCatList> SList = CatService.getPcatList(id);
			for (NewParentCatList soncat : SList) {
				String b = "<li class='level2'> <a href='http://localhost:8082/products/"+soncat.getPid()+".html'>"+soncat.getPcatname()+"</span> </a></li>";
				buffer.append(b);
				
			}
			buffer.append("</li></ul>");
		}
		
		String b = buffer.toString();
		
		
		return b;
		
	}

}
