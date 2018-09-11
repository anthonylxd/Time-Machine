package com.service;

public interface LoginService {
	/**
	 * 用户登录验证
	 * @param parname
	 * @param password
	 * @return
	 */
	boolean loginuser(String parname,String password);
	
	/**
	 * 用户存在检查
	 * @param parname
	 * @param password
	 * @return
	 */
	boolean checkuser(String parname);
}
