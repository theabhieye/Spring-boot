package com.theabhieye.MCQ.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.theabhieye.MCQ.Model.Questions;

@Transactional
@Service
public interface QuestionService {
	List<Questions> getAllMCQ();  
	Questions getQuestionById(long id);
	void addQuestion(Questions newQuestion);
}
