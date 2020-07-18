package com.theabhieye.SpringBootMVC.dao;

import org.springframework.data.repository.CrudRepository;

import com.theabhieye.SpringBootMVC.model.Article;

public interface ArticleDAO extends CrudRepository<Article,Long> {

}