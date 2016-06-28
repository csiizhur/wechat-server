package com.lanen.wechat.dispatcher;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.common.GetUseInfo;
import com.lanen.wechat.mapping.OpenUserMapper;
import com.lanen.wechat.message.resp.Article;
import com.lanen.wechat.message.resp.Image;
import com.lanen.wechat.message.resp.ImageMessage;
import com.lanen.wechat.message.resp.NewsMessage;
import com.lanen.wechat.pojo.OpenUser;
import com.lanen.wechat.util.HttpPostUploadUtil;
import com.lanen.wechat.util.MessageUtil;

import net.sf.json.JSONObject;

/**
 * ClassName: EventDispatcher
 * 
 * @Description: 事件消息业务分发器
 * @author dapengniao
 * @date 2016年3月7日 下午4:04:41
 */
@Service
public class EventDispatcher {
	private static Logger logger = Logger.getLogger(EventDispatcher.class);

	@Autowired
	private GetUseInfo getUseInfo;
	@Autowired
	private OpenUserMapper openUserMapper;

	public String processEvent(Map<String, String> map) {
		String openid = map.get("FromUserName"); // 用户openid
		String mpid = map.get("ToUserName"); // 公众号原始ID
		
		ImageMessage imgmsg = new ImageMessage();
		imgmsg.setToUserName(openid);
		imgmsg.setFromUserName(mpid);
		imgmsg.setCreateTime(new Date().getTime());
		imgmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_Image);
		
		//对图文消息
		NewsMessage newmsg=new NewsMessage();
		newmsg.setToUserName(openid);
		newmsg.setFromUserName(mpid);
		newmsg.setCreateTime(new Date().getTime());
		newmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
		if (map.get("Event").equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) { // 关注事件
			try {
				//记录关注的用户信息
				Map<String,String> useMap=getUseInfo.Openid_userinfo(openid);
				OpenUser openuser=new OpenUser();
				openuser.setCity(useMap.get("city"));
				openuser.setCountry(useMap.get("country"));
				openuser.setSubscribe(Integer.parseInt(useMap.get("subscribe")));
				openuser.setHeadImgUrl(useMap.get("headimgurl"));
				openuser.setLanguage(useMap.get("language"));
				//用户名含有表情字符
				//### Error updating database.  Cause: com.mysql.jdbc.MysqlDataTruncation: Data truncation: Data truncated for column 'nickname' at row 1
				//此处未作处理
				openuser.setNickName(useMap.get("nickname"));
				openuser.setOpenId(useMap.get("openid"));
				openuser.setProvince(useMap.get("province"));
				openuser.setSex(Integer.parseInt(useMap.get("sex")));
				if(openUserMapper.queryOpenUser(openid)==null){

					openUserMapper.insertOpenUser(openuser);}
				else{
					openuser.setSubscribe(1);
					openUserMapper.updateOpenUser(openuser);
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			//获取关注用户的信息
			try {
					HashMap<String, String> userinfo=GetUseInfo.Openid_userinfo(openid);
					Article article=new Article();
					article.setDescription("欢迎关注苏州西山中科：GLP实验室信息化解决方案！"); //图文消息的描述
					article.setPicUrl(userinfo.get("headimgurl")); //图文消息图片地址
					article.setTitle("尊敬的："+userinfo.get("nickname")+",你好！");  //图文消息标题
					article.setUrl("http://20572ec.nat123.net/index/list.do");  //图文url链接
					List<Article> list=new ArrayList<Article>();
					list.add(article);     //这里发送的是单图文，如果需要发送多图文则在这里list中加入多个Article即可！
					newmsg.setArticleCount(list.size());
					newmsg.setArticles(list);
					return MessageUtil.newsMessageToXml(newmsg);
			} catch (Exception e) {
				logger.error(e,e);
			}
		
		}

		if (map.get("Event").equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) { // 取消关注事件
			OpenUser openUser=openUserMapper.queryOpenUser(openid);
			openUser.setSubscribe(0);
			openUserMapper.updateOpenUser(openUser);
		}

		if (map.get("Event").equals(MessageUtil.EVENT_TYPE_SCAN)) { // 扫描二维码事件
			System.out.println("==============这是扫描二维码事件！");
		}

		if (map.get("Event").equals(MessageUtil.EVENT_TYPE_LOCATION)) { // 位置上报事件
			System.out.println("==============这是位置上报事件！");
		}

		if (map.get("Event").equals(MessageUtil.EVENT_TYPE_CLICK)) { // 自定义菜单点击事件
			System.out.println("==============这是自定义菜单点击事件！");
			if(map.get("EventKey").equals("image")){
				Image img = new Image();
				HttpPostUploadUtil util=new HttpPostUploadUtil();
				String filepath="H:\\1.jpg";  
		        Map<String, String> textMap = new HashMap<String, String>();  
		        textMap.put("name", "testname");  
		        Map<String, String> fileMap = new HashMap<String, String>();  
		        fileMap.put("userfile", filepath); 
				String mediaidrs = util.formUpload(textMap, fileMap);
				System.out.println(mediaidrs);
				String mediaid=JSONObject.fromObject(mediaidrs).getString("media_id");
				img.setMediaId(mediaid);
				imgmsg.setImage(img);
				return MessageUtil.imageMessageToXml(imgmsg);
			}else if(map.get("EventKey").equals("text")){
			    System.out.println("这里是回复图文消息!");
			    Article article=new Article();
				article.setDescription("这是图文消息1"); //图文消息的描述
				article.setPicUrl("http://res.cuiyongzhi.com/2016/03/201603086749_6850.png"); //图文消息图片地址
				article.setTitle("图文消息1");  //图文消息标题
				article.setUrl("http://www.cuiyongzhi.com");  //图文url链接
				List<Article> list=new ArrayList<Article>();
				list.add(article);     //这里发送的是单图文，如果需要发送多图文则在这里list中加入多个Article即可！
				newmsg.setArticleCount(list.size());
				newmsg.setArticles(list);
				return MessageUtil.newsMessageToXml(newmsg);
			}
		}

		if (map.get("Event").equals(MessageUtil.EVENT_TYPE_VIEW)) { // 自定义菜单View事件
			System.out.println("==============这是自定义菜单View事件！");
			
		}

		return null;
	}
}
