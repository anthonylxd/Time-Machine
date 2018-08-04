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
import com.pojo.UserLogin;
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
		Map map = new HashMap();
		map.put("result", result);
		return JSON.toJSONString(map);
	}
	
	/** 用户注册 **/
	@RequestMapping(value="/registeruser")
	@ResponseBody
	public String register(UserLogin userLogin) {
		boolean result = false;
		Map map = new HashMap();
		if(!userLogin.getFirpass().equals(userLogin.getSecpass())){
			map.put("result", result);
			map.put("key", "secpass");
			map.put("message", "确认密码与登录密码不一致");
		}else if(!registerService.checkUsername(userLogin.getUsername())){
			map.put("result", result);
			map.put("key", "username");
			map.put("message", "用户名已被注册");
		}else{	
			result = true;
			result = registerService.register(userLogin);
			map.put("result", result);
		}
		return JSON.toJSONString(map);
	}
}
