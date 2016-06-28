package com.lanen.wechat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.mapping.ArticleMapper;
import com.lanen.wechat.pojo.Article;

@Service
public class ArticleService {

	@Autowired
	private ArticleMapper articleMapper;
	
	public List<Article> getArticles(){
		return articleMapper.getHotArticles();
		
	}
}
