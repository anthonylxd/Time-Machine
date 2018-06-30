package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Team;

@Controller
@RequestMapping(value="/team")
public class TeamController {
	
	@RequestMapping(value="/go")
	@ResponseBody
	public Object get(Team team){
		System.out.println("123");
		System.out.println("11"+team.getName());
		return 0;
	}
}
