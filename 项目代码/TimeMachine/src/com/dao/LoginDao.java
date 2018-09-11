package com.dao;

public interface LoginDao {

	/**
	 * 登录验证
	 * @return
	 */
	int loginuser();
	
	/**
	 * 用户存在检查
	 * @return
	 */
	int checkuser();
	
	
}
