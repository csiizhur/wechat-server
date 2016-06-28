package com.lanen.wechat.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanen.wechat.pojo.Company;
import com.lanen.wechat.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	private static Logger logger = Logger.getLogger(CompanyController.class);

	@Autowired
	private CompanyService companyService;
	
	/**
	 * 公司介绍
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView getCompanyInfo(){
		ModelAndView model=new ModelAndView();
		
		Company c=companyService.getCompanyInfo();
		model.addObject("company", c);
		model.setViewName("company");
		return model;
	}
	
}
