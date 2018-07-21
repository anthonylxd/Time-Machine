package com.service;

import com.pojo.UserLogin;

public interface RegisterService {

	boolean checkUsername(String username);
	
	boolean register(UserLogin userLogin);
}
