package com.lanen.wechat.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lanen.wechat.common.OauthCode_GetUseInfo;
import com.lanen.wechat.mapping.MemberMapper;
import com.lanen.wechat.pojo.Member;

/**
 * 
 * @Description 会员资料完善
 * @ClassName WechatOauthController.java
 * @author Administrator
 * @date 2016年6月15日上午10:35:15
 */
@Controller
@RequestMapping("/member")
public class OpenUserMemberController {

	@Autowired
	private MemberMapper memberMapper;
	/**
	 * url拼接授权
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String skipToOauth(HttpServletRequest request,
			HttpServletResponse response,Member member,String openId) throws Exception {

		int result=0;
		/*if(birthdayStr!=null){
			java.sql.Date birthday=DateUtil.stringToSQLDate(birthdayStr);
			member.setBirthday(birthday);
			
			System.err.println(member.getBirthday());
		}*/
		if(openId!=null){
			result=memberMapper.updateMemberInfo(member);
		}else{
			result=memberMapper.insertMember(member);
		}
		//return new ModelAndView("redirect:" + "/oauth/list.do"); 
		return result+"";
	}

	@RequestMapping("/user")
	public ModelAndView weiXinOauth(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();

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
