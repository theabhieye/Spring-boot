
package com.theabhieye.SpringBootMVC.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theabhieye.SpringBootMVC.model.Author;
import com.theabhieye.SpringBootMVC.services.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController  {
	
	@Autowired
	AuthorService authorService;
	
	@PostMapping("/addAuthor")
	ResponseEntity<Void> addAuthor(@RequestBody Author ar){
		System.out.println(ar);
		authorService.addAuthor(ar);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/fetchAllAuthor")
	ResponseEntity<List<Author>> fetchAllAuthor(){
		List<Author> al = authorService.fetchAllAuthor();
		return new ResponseEntity<List<Author>>(al,HttpStatus.OK);
	}
	@PutMapping("/updateAuthor")
	ResponseEntity<Author> updateAuthor(@RequestBody Author ar){
		Author au = authorService.updateAuthor(ar);
		System.out.println(au);
		return new ResponseEntity<Author>(au,HttpStatus.OK);
	}
	@GetMapping("/fetchAuthorById/{id}")
	ResponseEntity<Author> fetchAuthorById(@PathVariable("id") int id){
		Author ar=authorService.fetchAuthorById(id);
		System.out.println(id);
		System.out.println(ar);
		return new ResponseEntity<Author>(ar,HttpStatus.OK);
	}	
}