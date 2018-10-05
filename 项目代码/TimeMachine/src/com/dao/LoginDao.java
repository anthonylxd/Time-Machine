package com.dao;

import org.apache.ibatis.annotations.Param;

public interface LoginDao {

	/**
	 * 登录验证
	 * @return
	 */
	int loginuser(@Param("uname")String uname,@Param("uemail")String uemail,@Param("upassword")String upassword);
	
	/**
	 * 用户存在检查
	 * @return
	 */
	int checkuser(@Param("uname")String uname,@Param("uemail")String uemail);
	
	
}
