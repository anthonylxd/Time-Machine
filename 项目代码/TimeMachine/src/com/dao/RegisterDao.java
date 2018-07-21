package com.dao;

import com.pojo.UserLogin;

/**
 * 注册
 * @author Anthony
 * 
 */

public interface RegisterDao {
	
	/*用户名唯一性检测*/
	int checkUsername(String username);
	
	/*注册*/
	boolean register(UserLogin userlogin);
}
