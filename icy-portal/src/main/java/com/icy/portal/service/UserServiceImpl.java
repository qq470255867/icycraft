package com.icy.portal.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.icy.common.pojo.TaotaoResult;
import com.icy.common.utils.HttpClientUtil;
import com.icy.pojo.TbUser;
@Service
public class UserServiceImpl implements UserService {
	
	
	@Value("${SSO_USER_TOKEN}")
	public String SSO_USER_TOKEN;
	
	@Value("${SSO_BASE_URL}")
	public String SSO_BASE_URL;
	
	@Value("${SSO_PAGE_LOGIN}")
	public String SSO_PAGE_LOGIN;

	@Override
	public TbUser getUserByToken(String token) {
		try {
			
			
			String http = HttpClientUtil.doGet(SSO_BASE_URL+SSO_USER_TOKEN+token);
			
			TaotaoResult pojo = TaotaoResult.formatToPojo(http, TbUser.class);
			if (pojo.getStatus()==200) {
				
				TbUser user = (TbUser) pojo.getData();
				
				return user;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
