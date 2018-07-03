package com.controller;

/**
 * 用户注册
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public String checkUsername() {
		
		boolean result = true;
		
		
		
		return result+"";
	}
	
	
}
