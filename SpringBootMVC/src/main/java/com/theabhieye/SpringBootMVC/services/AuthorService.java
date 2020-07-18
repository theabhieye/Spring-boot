package com.theabhieye.SpringBootMVC.services;

import java.util.List;

import com.theabhieye.SpringBootMVC.model.Author;

public interface AuthorService {
	public void addAuthor(Author ar);
	public List<Author> fetchAllAuthor();
	public Author updateAuthor(Author au);
	public Author fetchAuthorById(int id);
}