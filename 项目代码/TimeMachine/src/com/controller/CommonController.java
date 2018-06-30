package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.service.TeamService;

@Controller
@RequestMapping(value="/common")
public class CommonController {
	
	@Autowired
	private TeamService teamService;

	@RequestMapping(value="/goAddteam")
	public ModelAndView goAddteam() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("mian/addTeam");
		int result = teamService.test();
		return mv; 	
	}
	
	@RequestMapping(value="/freeType")
	public ModelAndView goFreeType() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("free/freeType");
		return mv;
	}
}
