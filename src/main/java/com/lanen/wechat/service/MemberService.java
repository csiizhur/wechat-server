package com.lanen.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.mapping.MemberMapper;
import com.lanen.wechat.pojo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	public int updateMemberInfo(Member m){
		return memberMapper.updateMemberInfo(m);
		
	}
	
	public int insertMember(Member m){
		return memberMapper.insertMember(m);
	}
	
	public Member queryMemberInfoByOpenId(String openId){
		return memberMapper.queryMemberInfoByOpenId(openId);
	}
}
