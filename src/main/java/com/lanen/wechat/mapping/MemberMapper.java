package com.lanen.wechat.mapping;

import com.lanen.wechat.pojo.Member;

public interface MemberMapper {
	
	/**
	 * 会员资料更新
	 * @return
	 */
	int updateMemberInfo(Member m);
	
	int insertMember(Member m);
	
	Member queryMemberInfoByOpenId(String openId);
}
