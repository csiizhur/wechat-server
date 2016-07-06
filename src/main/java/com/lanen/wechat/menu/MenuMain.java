package com.lanen.wechat.menu;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.lanen.wechat.util.HttpUtils;

import net.sf.json.JSONArray;

public class MenuMain {

	private static String token="Hyt_PkhoqObqAEmPFTtij44iimYJ4-RQw8j_AQaVb3rHB_37R4_rjDO6dCSvOXcyTh1Keb5jkmIhUEB9SfIexa5VFiq6A34eJy5CCQ0vq54FKZfAFAINC";
	public static void main(String[] args) {
	
		ClickButton cbt=new ClickButton();
		cbt.setKey("image");
		cbt.setName("回复图片");
		cbt.setType("click");
		
		
		ViewButton vbt=new ViewButton();
		vbt.setUrl("http://http://csii.nat123.net/static/iscroll.html");
		vbt.setName("博客");
		vbt.setType("view");
		
		JSONArray sub_button=new JSONArray();
		sub_button.add(cbt);
		sub_button.add(vbt);
		
		
		JSONObject buttonOne=new JSONObject();
		buttonOne.put("name", "菜单");
		buttonOne.put("sub_button", sub_button);
		
		JSONArray button=new JSONArray();
		button.add(vbt);
		button.add(buttonOne);
		button.add(cbt);
		
		JSONObject menujson=new JSONObject();
		menujson.put("button", button);
		System.out.println(menujson);
		//这里为请求接口的url   +号后面的是token，这里就不做过多对token获取的方法解释
		String url="https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+token;
		
		try{
			String rs=HttpUtils.sendPostBuffer(url, menujson.toJSONString());
			System.out.println(rs);
		}catch(Exception e){
			System.out.println("请求错误！");
		}
	
	}
	/**
	 * 创建菜单
	 */
	@Test
	public void createMenu() {
		JSONArray menu=new JSONArray();
		
		JSONArray sub_button=new JSONArray();
		
		ViewButton vbt1=new ViewButton();
		vbt1.setUrl("http://20572ec.nat123.net/company/list.do");
		vbt1.setName("公司介绍");
		vbt1.setType("view");
		
		ViewButton vbt2=new ViewButton();
		vbt2.setUrl("http://20572ec.nat123.net/team/list.do");
		vbt2.setName("技术团队");
		vbt2.setType("view");
		
		ViewButton vbt3=new ViewButton();
		vbt3.setUrl("http://20572ec.nat123.net/honor/list.do");
		vbt3.setName("资质荣誉");
		vbt3.setType("view");
		
		ViewButton vbt4=new ViewButton();
		vbt4.setUrl("http://20572ec.nat123.net/serviceitem/list.do");
		vbt4.setName("服务项目");
		vbt4.setType("view");
		
		ViewButton vbt5=new ViewButton();
		vbt5.setUrl("http://20572ec.nat123.net/wap/index.html");
		vbt5.setName("功能实验室");
		vbt5.setType("view");
		
		sub_button.add(vbt1);
		sub_button.add(vbt2);
		sub_button.add(vbt3);
		sub_button.add(vbt4);
		sub_button.add(vbt5);
		
		
		JSONObject button=new JSONObject();
		button.put("name", "关于我们");
		button.put("sub_button", sub_button);
		
		JSONArray sub_button2=new JSONArray();
		
		ViewButton vbt6=new ViewButton();
		vbt6.setUrl("http://20572ec.nat123.net/wap/index.html");
		vbt6.setName("实验计划表");
		vbt6.setType("view");
		
		ViewButton vbt7=new ViewButton();
		vbt7.setUrl("http://20572ec.nat123.net/wechatconfig/toJSSDK.do");
		vbt7.setName("实验报告");
		vbt7.setType("view");
		ViewButton vbt8=new ViewButton();
		
		/*String outhurl="https://open.weixin.qq.com/connect/oauth2/authorize?"
				+ "appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect"
				.replace("APPID", "wx4b95c99cfbea20fc")
				.replace("REDIRECT_URI", "http://20572ec.nat123.net/oauth/weixinOauth.do")
				.replace("SCOPE", "snsapi_userinfo").replace("STATE", "2");
		vbt8.setUrl(outhurl);*/
		vbt8.setUrl("http://20572ec.nat123.net/oauth/list.do");
		vbt8.setName("会员中心");
		vbt8.setType("view");
		sub_button2.add(vbt6);
		sub_button2.add(vbt7);
		sub_button2.add(vbt8);
		
		JSONObject button2=new JSONObject();
		button2.put("name", "会员专区");
		button2.put("sub_button", sub_button2);
		
		ViewButton vbt9=new ViewButton();
		vbt9.setUrl("http://20572ec.nat123.net/index/list.do");
		vbt9.setName("联系我们");
		vbt9.setType("view");
		
		menu.add(button);
		menu.add(button2);
		menu.add(vbt9);
		
		JSONObject menujson=new JSONObject();
		menujson.put("button", menu);
		System.err.println(menujson);
		String url="https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+token;
		String jsonData = JSONObject.toJSON(menujson).toString();
		String result = null;
		try {
			result = HttpUtils.sendPostBuffer(url, menujson.toJSONString());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(result);
	}
	
	/**
	 * 删除自定义菜单
	 * 
	 * @param token
	 * @return
	 */
	@Test
	public void deleteMenu() {
		// 删除自定义菜单
		String menu_delte = "https://api.weixin.qq.com/cgi-bin/menu/delete";

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("access_token", token);
		String result = null;
		try {
			result = HttpUtils.sendPost(menu_delte, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject object = JSONObject.parseObject(result);
		if (object.getInteger("errcode") != 0|| object.getString("errmsg") != "ok") { // 删除失败
			System.err.println(object.get("errmsg"));;
		}
	}
	/**
	 * 测试获取自定义菜单
	 */
	@Test
	public void testGetMenu(){
		// 查询自定义菜单
		String menu_get = "https://api.weixin.qq.com/cgi-bin/menu/get";
		
		Map<String, String> params = new HashMap<String,String>();
		params.put("access_token", token);
		try {
			String rs=HttpUtils.sendGet(menu_get, params);
			System.err.println(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
