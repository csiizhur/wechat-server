package com.lanen.wechat.mapping;

import com.lanen.wechat.pojo.OpenUser;

public interface OpenUserMapper {

	/*
	 * 录入openuser信息
	 */
	int insertOpenUser(OpenUser user);
	
	/*
	 * 查询openuser
	 */
	OpenUser queryOpenUser(String openId);
	
	/*
	 * 更新openuser
	 */
	Integer updateOpenUser(OpenUser user);
}
