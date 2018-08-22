package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(value="/login")
	public ModelAndView login(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login/login.jsp");
		return mv;
	}
	
	@RequestMapping(value="/loginuser")
	@ResponseBody
	public String loginuser(String parname,String password){
		
		System.out.println("111 "+parname);
		System.out.println("222 "+password);
		return "我要登录";
	}
	
	
}
