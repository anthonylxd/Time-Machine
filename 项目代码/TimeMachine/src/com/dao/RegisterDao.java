package com.dao;

/**
 * 注册
 * @author Anthony
 * 
 */

public interface RegisterDao {
	/*用户名唯一性检测*/
	int checkUsername(String username);
}
