package com.theabhieye.SpringBootMVC.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theabhieye.SpringBootMVC.dao.ArticleDAO;
import com.theabhieye.SpringBootMVC.dao.AuthorDAO;
import com.theabhieye.SpringBootMVC.model.Article;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleDAO articleDAO;
	@Autowired
	AuthorDAO authorDAO;
	
	@Override
	public Article fetchArticleById(Long id) {
		Optional<Article> ar = articleDAO.findById(id);
		System.out.println(ar.get());
		return ar.get();
	}


	@Override
	public Article saveArticle(Article ar) {
		return articleDAO.save(ar);
	/*
	 	Article a = new Article();
		System.out.println("\n in save article\n");
		Optional<Author> au= authorDAO.findById(ar.getAuthor().getAuthorID());
		if(!au.isPresent()) {
			System.out.println("test ");
			a.setMessage("Author Not Found");
			return a;
		}
		
		System.out.println("Author found "+au.get());
		ar.setAuthor(au.get());
		a=articleDAO.save(ar);
		a.setMessage("Author found");
		return a;
	*/
	}

	@Override
	public List<Article> fetchAllArticle() {
		List<Article> al =(List<Article>) articleDAO.findAll();
		return al;
	}

	@Override
	public void deleteById(Long id) {
		articleDAO.deleteById(id);
	}

	@Override
	public Article updateArticle(Article ar) {
		Article temp = this.fetchArticleById(ar.getArticleId());
		temp.setContent(ar.getContent());
		temp.setDislikes(ar.getDislikes());
		temp.setLikes(ar.getLikes());
		articleDAO.save(temp);
		return temp;
	}

	
}
