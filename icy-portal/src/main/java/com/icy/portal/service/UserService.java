package com.icy.portal.service;

import com.icy.pojo.TbUser;

public interface UserService {
	
	public TbUser getUserByToken(String token);

}
