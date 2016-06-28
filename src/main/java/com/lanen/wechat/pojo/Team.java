package com.lanen.wechat.pojo;

import java.sql.Timestamp;

/**
 * 技术团队
 * @author zhur
 *
 */
public class Team {

	private int id;
	
	private String teamName;
		
	private String teamInfo;
			
	private String teamPic;
	
	private int createUser;
	
	private Timestamp createTime;
	
	private int isDel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamInfo() {
		return teamInfo;
	}

	public void setTeamInfo(String teamInfo) {
		this.teamInfo = teamInfo;
	}

	public String getTeamPic() {
		return teamPic;
	}

	public void setTeamPic(String teamPic) {
		this.teamPic = teamPic;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public int getIsDel() {
		return isDel;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	
	
	
}
