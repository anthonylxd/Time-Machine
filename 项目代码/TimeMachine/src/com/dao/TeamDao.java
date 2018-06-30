package com.dao;

import java.util.List;
import com.pojo.Team;

/**
 * 球队dao层接口
 * @author Anthony
 *
 */
public interface TeamDao {
	 
	Team queryById(int id);
	
	List<Team> queryall(int offer,int limit); 
	
	int insertTeam(Team team);
	
	int deleteTeam(int id);
	
	int updateTeam(Team team);
 	
}
