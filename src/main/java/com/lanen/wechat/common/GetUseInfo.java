package com.lanen.wechat.common;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.lanen.web.util.GlobalConstants;
import com.lanen.wechat.util.HttpUtils;

import net.sf.json.JSONObject;

/**
 * 
 * @Description 获取微信用户信息
 * @ClassName GetUseInfo.java
 * @author Administrator
 * @date 2016年6月28日下午4:25:51
 */
@Service
public class GetUseInfo {
	/**
	 * 通过openid获取微信用户信息
	 * @param openid
	 * @return
	 * @throws Exception
	 * @author Administrator-zhur
	 * @date 2016年6月28日 下午4:30:17
	 */
	public static HashMap<String, String> Openid_userinfo(String openid)
			throws Exception {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("access_token",
				GlobalConstants.getInterfaceUrl("access_token"));  //定时器中获取到的token
		params.put("openid", openid);  //需要获取的用户的openid
		params.put("lang", "zh_CN");
		String subscribers = HttpUtils.sendGet(
				GlobalConstants.getInterfaceUrl("OpenidUserinfoUrl"), params);
		System.out.println(subscribers);
		params.clear();
		//这里返回参数只取了昵称、头像、和性别
		params.put("nickname",
				JSONObject.fromObject(subscribers).getString("nickname")); //昵称
		params.put("headimgurl",
				JSONObject.fromObject(subscribers).getString("headimgurl"));  //图像
		params.put("sex", JSONObject.fromObject(subscribers).getString("sex"));  //性别
		params.put("city", JSONObject.fromObject(subscribers).getString("city"));
		params.put("country", JSONObject.fromObject(subscribers).getString("country"));
		params.put("province", JSONObject.fromObject(subscribers).getString("province"));
		params.put("language", JSONObject.fromObject(subscribers).getString("language"));
		params.put("subscribe", JSONObject.fromObject(subscribers).getString("subscribe"));
		params.put("openid", JSONObject.fromObject(subscribers).getString("openid"));
		params.put("subscribe_time", JSONObject.fromObject(subscribers).getString("subscribe_time"));
		//开发者可通过OpenID来获取用户基本信息。特别需要注意的是，如果开发者拥有多个移动应用、网站应用和公众帐号，可通过获取用户基本信息中的unionid来区分用户的唯一性，因为只要是同一个微信开放平台帐号下的移动应用、网站应用和公众帐号，用户的unionid是唯一的。换句话说，同一用户，对同一个微信开放平台下的不同应用，unionid是相同的。
		//params.put("unionid", JSONObject.fromObject(subscribers).getString("unionid"));
		params.put("remark", JSONObject.fromObject(subscribers).getString("remark"));
		params.put("groupid", JSONObject.fromObject(subscribers).getString("groupid"));
		params.put("tagid_list", JSONObject.fromObject(subscribers).getString("tagid_list"));
		return params;
	}

}
