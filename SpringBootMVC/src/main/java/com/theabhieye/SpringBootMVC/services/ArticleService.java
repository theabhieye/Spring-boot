package com.theabhieye.SpringBootMVC.services;

import java.util.List;

import com.theabhieye.SpringBootMVC.model.Article;

public interface ArticleService {
	Article fetchArticleById(Long id);
	Article saveArticle(Article ar);
	List<Article> fetchAllArticle();
	void deleteById(Long id);
	Article updateArticle(Article ar);
}
