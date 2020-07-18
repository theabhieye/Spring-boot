package com.theabhieye.SpringBootMVC.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theabhieye.SpringBootMVC.dao.CommentDAO;
import com.theabhieye.SpringBootMVC.model.Comments;


@Service
@Transactional
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDAO commentDao;
	 
	@Override
	public void addComment(Comments c) {
		commentDao.save(c);
	}
	
}
