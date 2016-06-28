package com.lanen.wechat.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lanen.Message;
import com.lanen.wechat.common.JSSDK_Config;

/**
 * ClassName: WechatConfigController
 * @Description: 前端用户微信配置获取
 * @author zhur
 * @date 2016年3月19日 下午5:57:36
 */
@Controller
@RequestMapping("/wechatconfig")
public class WechatConfigController {
	
	
	private static Logger logger = Logger.getLogger(WechatConfigController.class);
	
	/**
	 * 跳转jssdk页面
	 * @return
	 */
	@RequestMapping("/toJSSDK")
	public String toJSSDK(){
		return "jssdkconfig";
	}
	/**
	 * @Description: 前端获取微信JSSDK的配置参数
	 * @param @param response
	 * @param @param request
	 * @param @param url
	 * @param @throws Exception
	 * @author zhur
	 * @throws IOException 
	 * @date 2016年3月19日 下午5:57:52
	 */
	@RequestMapping("jssdk")
	public void JSSDK_config(@RequestParam(value = "url", required = true) String url,HttpServletResponse res) throws IOException {
		
		String str=null;
		try {
			System.out.println(url);
			Map<String, String> configMap = JSSDK_Config.jsSDK_Sign(url);
			
			//bean --> JSONObject
			//JSONObject -->String
			//response.write()
			//maptoString=Message.success(configMap).toString();
			Message mess=Message.success(configMap);
			JSONObject json=JSONObject.fromObject(mess);
			str=json.toString();
			
		} catch (Exception e) {
			logger.error(e,e);
			//return Message.error();
		}
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		res.getWriter().write(str);
		res.getWriter().flush();
	}

}
