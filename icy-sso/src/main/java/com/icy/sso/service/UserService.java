package com.icy.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icy.common.pojo.TaotaoResult;
import com.icy.common.utils.HttpClientUtil;
import com.icy.pojo.TbUser;

public interface UserService {
	
	TaotaoResult registerCheck(String param,Integer type);
	
	TaotaoResult createUser(TbUser user);
	
	TaotaoResult UserLogin(String username, String pwd,HttpServletRequest request,HttpServletResponse response);
	
    TaotaoResult getUserByToken(String token);
    
    TaotaoResult UserLogout(String token,HttpServletRequest request,HttpServletResponse response);
}
