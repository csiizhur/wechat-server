package com.lanen.wechat.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanen.wechat.pojo.ServiceItem;
import com.lanen.wechat.service.ServiceItemService;

/**
 * 
 * @Description 
 * @ClassName ServiceItemController.java
 * @author Administrator
 * @date 2016年6月15日下午3:45:16
 */
@Controller
@RequestMapping("/serviceitem")
public class ServiceItemController {
	
	private static Logger logger = Logger.getLogger(ServiceItemController.class);

	@Autowired
	private ServiceItemService serviceItemService;
	
	@RequestMapping("/list")
	public ModelAndView getCompanyInfo(){
		ModelAndView model=new ModelAndView();
		
		List<ServiceItem> c=serviceItemService.getServiceItem();
		model.addObject("item", c);
		model.setViewName("serviceItem");
		return model;
	}
	
}
