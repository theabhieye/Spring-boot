package com.theabhieye.MCQ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theabhieye.MCQ.Model.Questions;
import com.theabhieye.MCQ.service.QuestionServiceImpl;

@RestController
@RequestMapping("/mcq")
public class MCQController {

	@Autowired
	QuestionServiceImpl quesService;
	
	@GetMapping("/getAllQuestion")
	public ResponseEntity<List<Questions>> getAllQuestion() {
		return new ResponseEntity<List<Questions>>(quesService.getAllMCQ(),HttpStatus.OK);
	}
	
	@GetMapping("/getQuestionById/qid={id}")
	public Questions getQuestionById(@PathVariable long id){
		return quesService.getQuestionById(id);
	}

	@PostMapping("/addQuestion")
	public ResponseEntity<Void> addQuestion(@RequestBody Questions q) {
		quesService.addQuestion(q);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
