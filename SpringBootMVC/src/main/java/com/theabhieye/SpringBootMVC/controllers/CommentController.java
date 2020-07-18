package com.theabhieye.SpringBootMVC.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theabhieye.SpringBootMVC.model.Comments;
import com.theabhieye.SpringBootMVC.services.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentService commentservice;
	
	@PostMapping("/addComment")
	ResponseEntity<Void> addComment(@RequestBody Comments c){
		System.out.println("\n"+c+"\n");
		commentservice.addComment(c);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}