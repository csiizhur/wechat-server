package com.lanen.wechat.mapping;

import java.util.List;

import com.lanen.wechat.pojo.ServiceItem;

/**
 * 
 * @Description 服务项目接口
 * @ClassName ServiceItemMapper.java
 * @author Administrator
 * @date 2016年6月15日下午3:42:00
 */
public interface ServiceItemMapper {
	
	List<ServiceItem> getServiceItem();
	
}
