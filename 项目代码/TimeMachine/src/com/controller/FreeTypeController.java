package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.FreeTeam;
import com.service.FreeService;

@Controller
@RequestMapping(value="/freeType")
public class FreeTypeController {
	
	@Autowired
	private FreeService freeService;
	
	
	@RequestMapping(value="/getData")
	@ResponseBody
	public ModelAndView getDate(HttpServletRequest request) {
		String tname1 = request.getParameter("tname1");
		String no1= request.getParameter("no1");
		String match11= request.getParameter("match11");
		String result11 = request.getParameter("result11");
		String match12 = request.getParameter("match12");
		String result12 = request.getParameter("result12");
		String match13 = request.getParameter("match13");
		String result13 = request.getParameter("result13");
		FreeTeam team1 = new FreeTeam();
		team1.setName(tname1);
		team1.setNo(no1);
		team1.setMatch1(match11);
		team1.setMatch2(match12);
		team1.setMatch3(match13);
		team1.setResult1(result11);
		team1.setResult2(result12);
		team1.setResult3(result13);
		String tname2 = request.getParameter("tname2");
		String no2= request.getParameter("no2");
		String match21= request.getParameter("match21");
		String result21 = request.getParameter("result21");
		String match22 = request.getParameter("match22");
		String result22 = request.getParameter("result22");
		String match23 = request.getParameter("match23");
		String result23 = request.getParameter("result23");
		FreeTeam team2 = new FreeTeam();
		team2.setName(tname2);
		team2.setNo(no2);
		team2.setMatch2(match22);
		team2.setMatch2(match22);
		team2.setMatch3(match23);
		team2.setResult2(result22);
		team2.setResult2(result22);
		team2.setResult3(result23);
		String result = freeService.start(team1, team2);
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("free/freeResult");
		return mv;
	}
}
