package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.RegisterService;
import com.dao.RegisterDao;

/**
 * 注册
 * @author Anthony
 *
 */

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDao registerDao; 
	
	@Override
	public boolean checkUsername(String username) {
		int count = registerDao.checkUsername(username);
		if (0 < count) {
			return false;
		}
		return true;
	}

}
