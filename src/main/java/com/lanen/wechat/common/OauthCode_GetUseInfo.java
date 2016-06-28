package com.lanen.wechat.common;

import java.util.HashMap;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import com.lanen.web.util.GlobalConstants;
import com.lanen.wechat.util.HttpUtils;

/**
 * 
 * @Description 用户oauth2.0授权登录 通过code获取用户真实信息
 * @ClassName OauthCode_GetUseInfo.java
 * @author Administrator
 * @date 2016年6月15日上午9:57:36
 */
public class OauthCode_GetUseInfo {

	private String openid;
	private String access_token;//非普通token
	private String code;
	private String unionid;
	private HashMap<String,String> params=new HashMap<String,String>();
	
	public OauthCode_GetUseInfo(String code){
		this.code=code;
		params.put("appid", GlobalConstants.getInterfaceUrl("appid"));
		params.put("secret", GlobalConstants.getInterfaceUrl("AppSecret"));
	}
	
	/*
	 * 1,将用户信息拼装成map,
	 * 2,通过code获取access_token,openid,unionid
	 * 3,通过openid获取详细信息
	 * 4,判断是否关注
	 * 5,再返回map
	 */
	public HashMap<String,String> getUserInfo() throws Exception{
		params.put("code", code);
		params.put("grant_type", "authorization_code");
		
		
		String tokenStr=HttpUtils.sendGet(GlobalConstants.getInterfaceUrl("OauthCodeUrl"), params);
		//当返回到授权页面 access_token报错
		//{"errcode":40029,"errmsg":"invalid code, hints: [ req_id: 5Fdj.a0749ns53 ]"}
		//access_token过期了
		access_token=JSONObject.fromObject(tokenStr).getString("access_token");
		
		
		openid=JSONObject.fromObject(tokenStr).getString("openid");
		//refresh_token有效期30天
		String refresh_token=JSONObject.fromObject(tokenStr).getString("refresh_token");
		//unionid=JSONObject.fromObject(tokenStr).getString("unionid");
		
		params.clear();
		params.put("access_token", access_token);
		params.put("openid", openid);
		params.put("lang", "zh_CN");
		String userInfos=HttpUtils.sendGet(GlobalConstants.getInterfaceUrl("OauthInfoUrl"), params);
		
		params.clear();
		params.put("access_token", GlobalConstants.getInterfaceUrl("access_token"));
		params.put("openid", openid);
		params.put("lang", "zh_CN");
		String subscribers="";
		//subscribers=HttpUtils.sendGet(GlobalConstants.getInterfaceUrl("SubscribeUrl"), params);
		
		params.clear();
		//params.put("subscribe",JSONObject.fromObject(subscribers).getString("subscribr"));
		params.put("openid", openid);
		//params.put("unionid", unionid);
		params.put("nickname", JSONObject.fromObject(userInfos).getString("nickname"));
		params.put("sex", JSONObject.fromObject(userInfos).getString("sex"));
		params.put("country", JSONObject.fromObject(userInfos).getString("country"));
		params.put("province", JSONObject.fromObject(userInfos).getString("province"));
		params.put("city", JSONObject.fromObject(userInfos).getString("city"));
		params.put("headimgurl", JSONObject.fromObject(userInfos).getString("headimgurl"));
		
		return params;
	}
	
	/***
	 * 
	 * @param openid
	 * @return
	 * @throws Exception 
	 */
	public static HashMap<String,String> Openid_userInfo(String openid) throws Exception{
		HashMap<String, String> params = new HashMap<String, String>();
        params.put("access_token",
                GlobalConstants.getInterfaceUrl("access_token"));
        params.put("openid", openid);
        params.put("lang", "zh_CN");
        String subscribers = HttpUtils.sendGet(GlobalConstants.getInterfaceUrl("SubscribeUrl"), params);
        params.clear();
        params.put("nickname",
                JSONObject.fromObject(subscribers).getString("nickname"));
        params.put("headimgurl",
                JSONObject.fromObject(subscribers).getString("headimgurl"));
        params.put("sex", JSONObject.fromObject(subscribers).getString("sex"));
        return params;
	}
	
	@SuppressWarnings("unused")
    private static String create_timestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }
}
