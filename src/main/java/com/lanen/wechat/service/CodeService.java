package com.lanen.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.mapping.CodeMapper;
import com.lanen.wechat.pojo.Code;

@Service
public class CodeService {

	@Autowired
	private CodeMapper codeMapper;
	
	public Code getOauthCode(String code){
		return codeMapper.getOauthCode(code);
		
	}
	
	public int insertOauthCode(String code){
		return codeMapper.insertOauthCode(code);
	}
}
