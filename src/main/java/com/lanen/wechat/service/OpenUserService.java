package com.lanen.wechat.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.common.GetUseInfo;
import com.lanen.wechat.pojo.OpenUser;

@Service
public class OpenUserService {

	@Autowired
	private GetUseInfo getUseInfo;
	
	public OpenUser getOpenUser(Map<String,String> map){

		String openid = map.get("FromUserName");
		
		OpenUser openuser=new OpenUser();
		Map<String, String> useMap;
		try {
			useMap = getUseInfo.Openid_userinfo(openid);
			
			
			openuser.setCity(useMap.get("city"));
			openuser.setCountry(useMap.get("country"));
			openuser.setSubscribe(Integer.parseInt(useMap.get("subscribe")));
			openuser.setHeadImgUrl(useMap.get("headimgurl"));
			openuser.setLanguage(useMap.get("language"));
			openuser.setNickName(useMap.get("nickname"));
			openuser.setOpenId(useMap.get("openid"));
			openuser.setProvince(useMap.get("province"));
			openuser.setSex(Integer.parseInt(useMap.get("sex")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return openuser;
		
	}
}
