package com.lanen.web.util;

import java.util.Properties;

/**
 * 
 * @Description 获取全局变量
 * @ClassName GlobalConstants.java
 * @author Administrator-zhur
 * @date 2016年5月28日下午5:02:55
 */
public class GlobalConstants {

	public static Properties interfaceUrlProperties;

	public static String getInterfaceUrl(String key) {
		return (String) interfaceUrlProperties.get(key);
	}
	
		
	
}
