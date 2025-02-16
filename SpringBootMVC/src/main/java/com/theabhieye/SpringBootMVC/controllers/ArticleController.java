package com.theabhieye.SpringBootMVC.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theabhieye.SpringBootMVC.model.Article;
import com.theabhieye.SpringBootMVC.services.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleService articleService;
	// Get articleById()
	// Get allArticle()
	// Delete deleteById()
	// POST saveArticle()
	// Put updateArticle()

	@GetMapping("/aricleById/{id}")
	public ResponseEntity<Article> articleById(@PathVariable("id") Long id){
		System.out.println(id);
		Article ar = articleService.fetchArticleById(id);
		return new ResponseEntity<Article>(ar,HttpStatus.OK);
	}
	
	@PostMapping("/saveArticle")
	public ResponseEntity<Article> saveArticle(@RequestBody Article ar){
		Article a = articleService.saveArticle(ar);
//		if(a.getMessage().equals("Author Not Found"))
//			return new ResponseEntity<Article>(a,HttpStatus.NOT_FOUND);
		return new ResponseEntity<Article>(a,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllArticle")
	public ResponseEntity<List<Article>> getAllArticle(){
		List<Article> al = articleService.fetchAllArticle();
		return new ResponseEntity<List<Article>>(al,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
		articleService.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/updateArticle")
	public ResponseEntity<Article> updateArticle(@RequestBody Article ar){
		Article temp = articleService.updateArticle(ar);
		return new ResponseEntity<Article>(temp,HttpStatus.ACCEPTED);
	}
}