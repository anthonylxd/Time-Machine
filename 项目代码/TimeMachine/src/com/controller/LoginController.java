package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

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
		
		Map map = new HashMap();
		System.out.println("222 "+password);
		
		map.put("result", "success");
		return JSON.toJSONString(map);
	}
	
	
}
