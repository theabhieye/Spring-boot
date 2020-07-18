package com.theabhieye.MCQ.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theabhieye.MCQ.Model.Questions;
import com.theabhieye.MCQ.doa.MCQdao;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	MCQdao mcqDAO;
	
	@Override
	public List<Questions> getAllMCQ() {
		List<Questions> al = new ArrayList<>();
		for(Questions q:mcqDAO.findAll())
			al.add(q);
		return al;
	}

	@Override
	public Questions getQuestionById(long id) {
		Optional<Questions> q;
		q = mcqDAO.findById(id);
		return q.get();
	}

	@Override
	public void addQuestion(Questions newQuestion) {
		mcqDAO.save(newQuestion);
	}
}