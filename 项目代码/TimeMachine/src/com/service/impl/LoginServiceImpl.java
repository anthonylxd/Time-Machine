package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDao;

/**
 * 登录Login
 */

import com.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public boolean loginuser(String parname, String password) {
		return loginDao.loginuser(parname,parname,password) == 1;
	}


	public boolean checkuser(String parname) {
		return loginDao.checkuser(parname,parname) == 1;
	}

}
