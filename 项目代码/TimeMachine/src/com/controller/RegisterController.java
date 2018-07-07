package com.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户注册
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value="/register")
public class RegisterController {

	@RequestMapping(value="/register")
	public ModelAndView goRegister() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register/register.jsp");
		return mv;
	}
	
	/**验证用户名唯一性*/
	@RequestMapping(value="/check")
	@ResponseBody
	public String checkUsername(String username) {		
		boolean result = true;	
		
		Map map = new HashMap();
		map.put("result", result);
		return JSON.toJSONString(map);
	}
	
	
}
