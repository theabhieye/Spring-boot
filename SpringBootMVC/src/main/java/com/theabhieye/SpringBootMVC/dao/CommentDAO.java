package com.theabhieye.SpringBootMVC.dao;

import org.springframework.data.repository.CrudRepository;

import com.theabhieye.SpringBootMVC.model.Comments;

public interface CommentDAO extends CrudRepository<Comments, Long> {

}
