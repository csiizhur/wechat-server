package com.lanen.wechat.mapping;

import java.util.List;

import com.lanen.wechat.pojo.Article;

public interface ArticleMapper {
	
	/*
	 * 文章首页
	 */
	List<Article> getHotArticles();
	
}
