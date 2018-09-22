package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.service.LoginService;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login/login.jsp");
		return mv;
	}
	
	@RequestMapping(value="/loginuser")
	@ResponseBody
	public String loginuser(String parname,String password){
		
		Map map = new HashMap();
		System.out.println("222 "+password);		
		if (!loginService.checkuser(parname)) {
			map.put("result", "fail");
			map.put("login", "1");
		}else if(!loginService.loginuser(parname, password)){
			map.put("result", "fail");
			map.put("login", "2");
		}else{
			map.put("result", "success");
			map.put("login", "0");
		}
				
		/**
		 * result
		 * 正常登录 success
		 * 登录失败 fail
		 */		
		/**
		 * login
		 * 0 正常登录
		 * 1 用户名不存在
		 * 2 密码错误
		 * 3 其它异常
		 */
		
		return JSON.toJSONString(map);
	}
	
	
}
