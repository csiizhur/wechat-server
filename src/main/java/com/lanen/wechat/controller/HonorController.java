package com.lanen.wechat.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanen.wechat.pojo.Honor;
import com.lanen.wechat.service.HonorService;

@Controller
@RequestMapping("/honor")
public class HonorController {
	
	private static Logger logger = Logger.getLogger(HonorController.class);

	@Autowired
	private HonorService honorService;
	
	/**
	 * 荣誉列表
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView index(){
		ModelAndView model=new ModelAndView();
		
		List<Honor> list=honorService.listHonor();
		model.addObject("list", list);
		model.setViewName("honor");
		return model;
	}
	
	@RequestMapping("/list2.do")
	public String index2(){
		return "honor";
	}
	
}
