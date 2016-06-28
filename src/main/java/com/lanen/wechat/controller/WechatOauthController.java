package com.lanen.wechat.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lanen.web.util.GlobalConstants;
import com.lanen.wechat.common.OauthCode_GetUseInfo;

/**
 * 
 * @Description
 * @ClassName WechatOauthController.java
 * @author Administrator
 * @date 2016年6月15日上午10:35:15
 */
@Controller
@RequestMapping("/oauth")
public class WechatOauthController {

	/**
	 * url拼接授权
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public ModelAndView skipToOauth(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String appid = GlobalConstants.getInterfaceUrl("appid");
		String redirect_uri = GlobalConstants.getInterfaceUrl("redirect_uri");
		String response_type = GlobalConstants.getInterfaceUrl("response_type");
		String scope = GlobalConstants.getInterfaceUrl("scope");
		String state = GlobalConstants.getInterfaceUrl("state");
		String redirectURL = GlobalConstants.getInterfaceUrl("OauthUrl")
				+ "?appid=" + appid + "&redirect_uri=" + redirect_uri
				+ "&response_type=" + response_type + "&scope=" + scope
				+ "&state=" + state;
		return new ModelAndView("redirect:" + redirectURL);
	}

	@RequestMapping("/user")
	public ModelAndView weiXinOauth(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("user");

		return mv;
	}

	/**
	 * 微信授权登录,由code换取access_token
	 * 
	 * @param request
	 * @param response
	 * @param code
	 * @param state
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/weixinOauth")
	public ModelAndView weiXinOauth(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value = "code", required = true) String code,
			@RequestParam(value = "state", required = true) String state)
			throws Exception {
		// 用code取得微信用户的基本信息
		OauthCode_GetUseInfo weixin = new OauthCode_GetUseInfo(code);
		Map<String, String> wmap = weixin.getUserInfo();

		ModelAndView mv = new ModelAndView();
		mv.addObject("userName", wmap.get("nickname"));

		mv.addAllObjects(wmap);

		// 通过openid查询会员系统数据
		String openid = wmap.get("openid");

		mv.setViewName("user");

		return mv;
	}
	
	/**
	 * 资料详情
	 * @param request
	 * @param response
	 * @param code
	 * @param state
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/user/info")
	public ModelAndView userInfo(HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value = "openId", required = true) String openId)
					throws Exception {
		
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("openId", openId);		
		mv.setViewName("form");
		
		return mv;
	}
}
