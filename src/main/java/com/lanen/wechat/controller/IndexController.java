package com.lanen.wechat.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanen.wechat.pojo.Article;
import com.lanen.wechat.service.ArticleService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	private static Logger logger = Logger.getLogger(IndexController.class);

	@Autowired
	private ArticleService articleService;
	
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView getCompanyInfo(){
		ModelAndView model=new ModelAndView();
		
		List<Article> listArticles=articleService.getArticles();
		model.addObject("list", listArticles);
		model.setViewName("index");
		return model;
	}
	
}
