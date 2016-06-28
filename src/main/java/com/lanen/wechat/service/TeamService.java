package com.lanen.wechat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.mapping.TeamMapper;
import com.lanen.wechat.pojo.Team;

@Service
public class TeamService {

	@Autowired
	private TeamMapper teamMapper;
	
	public List<Team> getTeamInfo(){
		List<Team> c=teamMapper.listTeamInfo();
		return c;
		
	}
}
