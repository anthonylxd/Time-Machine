package com.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.RegisterService;
import com.common.Random;
import com.dao.RegisterDao;
import com.pojo.UserLogin;

/**
 * 注册
 * @author Anthony
 *
 */

@Service
public class RegisterServiceImpl implements RegisterService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RegisterDao registerDao; 
	
	public boolean checkUsername(String username) {
		int count = registerDao.checkUsername(username);
		if (0 < count) {
			return false;
		}
		return true;
	}

	public boolean register(UserLogin userLogin) {
		userLogin.setUstatus("0");
		userLogin.setUid(Random.randomUuid());
		return registerDao.register(userLogin);
	}

}
