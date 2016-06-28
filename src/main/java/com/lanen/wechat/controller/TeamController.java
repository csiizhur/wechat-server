package com.lanen.wechat.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanen.wechat.pojo.Team;
import com.lanen.wechat.service.TeamService;

@Controller
@RequestMapping("/team")
public class TeamController {
	
	private static Logger logger = Logger.getLogger(TeamController.class);

	@Autowired
	private TeamService teamService;
	
	/**
	 * 技术团队
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView listTeam(){
		ModelAndView model=new ModelAndView();
		
		List<Team> c=teamService.getTeamInfo();
		model.addObject("list", c);
		model.setViewName("team");
		return model;
	}
	
}
