package com.theabhieye.SpringBootMVC.dao;

import org.springframework.data.repository.CrudRepository;

import com.theabhieye.SpringBootMVC.model.Author;

public interface AuthorDAO extends CrudRepository<Author, Integer>{
	
}