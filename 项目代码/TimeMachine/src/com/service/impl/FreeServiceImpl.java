package com.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.pojo.FreeTeam;
import com.service.FreeService;

@Service
public class FreeServiceImpl implements FreeService {

	public String start(FreeTeam team1,FreeTeam team2){
		team1.setResult(no(team1.getNo()));
		team2.setResult(no(team2.getNo()));
		team1.setResult(match(team1));
		team2.setResult(match(team2));
		
		
		Map< String, Object> map = new HashMap();
		map.put("team1", team1);
		map.put("team2", team2);
		return JSON.toJSONString(map);
		
	}
	
	public double no(int no){
		return (20-no)*0.2;
	}
	
	
	public double match(FreeTeam team){
		double result = team.getResult();
		int no1 = team.getMatch1();
		int no2 = team.getMatch2();
		int no3 = team.getMatch3();
		int result1 = team.getResult1();
		int result2 = team.getResult2();
		int result3 = team.getResult3();
		result += matchNo(no1, result1); 
		result += matchNo(no2, result2); 
		result += matchNo(no3, result3); 
		return result;
	};
	
	public double matchNo(int no,int result){
		return (20-no)*result*0.2;
	}
}
