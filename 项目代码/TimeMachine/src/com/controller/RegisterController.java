package com.controller;
/**
 * 用户注册
 */
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import com.service.RegisterService;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;

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
		boolean result =  registerService.checkUsername(username);
		System.out.println("此用户名"+result);
		Map map = new HashMap();
		map.put("result", result);
		return JSON.toJSONString(map);
	}
	
	/** 用户注册 **/
	public String register() {
		boolean result = true;
		
		
		Map map = new HashMap();
		map.put("result", result);
		return JSON.toJSONString(map);
	}
}
