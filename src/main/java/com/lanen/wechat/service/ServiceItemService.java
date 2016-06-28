package com.lanen.wechat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.mapping.ServiceItemMapper;
import com.lanen.wechat.pojo.ServiceItem;

@Service
public class ServiceItemService {

	@Autowired
	private ServiceItemMapper serviceItemMapper;
	
	public List<ServiceItem> getServiceItem(){
		return serviceItemMapper.getServiceItem();
		
	}
}
