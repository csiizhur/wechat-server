package com.lanen.wechat.mapping;

import com.lanen.wechat.pojo.Code;

public interface CodeMapper {
	
	/*
	 * 授权 code
	 */
	Code getOauthCode(String code);
	
	int insertOauthCode(String code);
}
