package com.lanen.wechat.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lanen.wechat.dispatcher.EventDispatcher;
import com.lanen.wechat.dispatcher.MsgDispatcher;
import com.lanen.wechat.util.MessageUtil;
import com.lanen.wechat.util.SignUtil;

@Controller
@RequestMapping("/wechat")
public class WechatSecurity {
	@Autowired
	private MsgDispatcher msgDispatcher;
	@Autowired
	private EventDispatcher eventDispatcher;
	private static Logger logger = Logger.getLogger(WechatSecurity.class);

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	/**
	 * 
	 * @Description: 用于接收get参数，返回验证参数
	 * @param @param request
	 * @param @param response
	 * @param @param signature
	 * @param @param timestamp
	 * @param @param nonce
	 * @param @param echostr
	 * @author dapengniao
	 * @date 2016年3月4日 下午6:20:00
	 */
	@RequestMapping(value = "/security", method = RequestMethod.GET)
	public void doGet(
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value = "signature", required = true) String signature,
			@RequestParam(value = "timestamp", required = true) String timestamp,
			@RequestParam(value = "nonce", required = true) String nonce,
			@RequestParam(value = "echostr", required = true) String echostr) {
		try {
			if (SignUtil.checkSignature(signature, timestamp, nonce)) {
				PrintWriter out = response.getWriter();
				out.print(echostr);
				out.close();
			} else {
				logger.info("这里存在非法请求！");
			}
		} catch (Exception e) {
			logger.error(e, e);
		}
	}

	/**
	 * @Description: 接收微信端消息处理并做分发
	 * @param @param request
	 * @param @param response   
	 * @author dapengniao
	 * @date 2016年3月7日 下午4:06:47
	 */
	@RequestMapping(value = "/security", method = RequestMethod.POST)
	public String DoPost(HttpServletRequest request,HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		try{
			Map<String, String> map=MessageUtil.parseXml(request);
			String msgtype=map.get("MsgType");
			if(MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgtype)){
				String msgrsp=eventDispatcher.processEvent(map); //进入事件处理
				PrintWriter out = response.getWriter();
				out.print(msgrsp);
				out.close();
				/*if(map.get("EventKey").equals("http://csii.nat123.net/openuser/user.do")){
					return "forward:/user";
				}*/
			}else{
				String msgrsp=msgDispatcher.processMessage(map); //进入消息处理
				PrintWriter out = response.getWriter();
				out.print(msgrsp);
				out.close();
			}
		}catch(Exception e){
			logger.error(e,e);
		}
		return null;
	}
}
