package com.lanen.wechat.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.lanen.web.util.GlobalConstants;
import com.lanen.wechat.util.HttpUtils;

/**
 * 
 * @Description 微信两小时定时任务体
 * @ClassName WeChatTask.java
 * @author Administrator-zhur
 * @date 2016年6月28日下午5:02:07
 */
public class WeChatTask {
	/**
	 * 执行定时任务
	 * @throws Exception
	 * @author Administrator-zhur
	 * @date 2016年6月28日 下午5:02:32
	 */
	public void getToken_getTicket() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		//获取token执行体
		params.put("grant_type", "client_credential");
		params.put("appid", GlobalConstants.getInterfaceUrl("appid"));
		params.put("secret", GlobalConstants.getInterfaceUrl("AppSecret"));
		String jstoken = HttpUtils.sendGet(
				GlobalConstants.getInterfaceUrl("tokenUrl"), params);
		String access_token = JSONObject.fromObject(jstoken).getString(
				"access_token"); // 获取到token并赋值保存
		GlobalConstants.interfaceUrlProperties.put("access_token", access_token);
		
		//获取jsticket的执行体
		params.clear();
		params.put("access_token", access_token);
		params.put("type", "jsapi");
		String jsticket = HttpUtils.sendGet(
				GlobalConstants.getInterfaceUrl("ticketUrl"), params);
		String jsapi_ticket = JSONObject.fromObject(jsticket).getString(
				"ticket"); 
		GlobalConstants.interfaceUrlProperties
		.put("jsapi_ticket", jsapi_ticket); // 获取到js-SDK的ticket并赋值保存
		
		System.out.println("jsapi_ticket================================================" + jsapi_ticket);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"token为=============================="+access_token);

	}

}
