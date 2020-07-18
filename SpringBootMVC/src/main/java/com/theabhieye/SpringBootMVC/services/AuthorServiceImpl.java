package com.theabhieye.SpringBootMVC.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theabhieye.SpringBootMVC.dao.AuthorDAO;
import com.theabhieye.SpringBootMVC.model.Author;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {
		
	@Autowired
	AuthorDAO authorDAO;
	
	@Override
	public void addAuthor(Author ar) {
		authorDAO.save(ar);
	}

	@Override
	public List<Author> fetchAllAuthor() {
		List<Author> ar = (List<Author>) authorDAO.findAll(); 
		return ar;
	}
	

	@Override
	public Author fetchAuthorById(int id) {
		Optional<Author> au = authorDAO.findById(id); 
		return au.get();
	} 
	
	
	@Override
	public Author updateAuthor(Author au) {
		Author temp = this.fetchAuthorById(au.getAuthorID());
		temp.setName(au.getName());
		temp.setEmail(au.getEmail());
		temp.setPhone(au.getPhone());
		authorDAO.save(temp);
		System.out.println(temp);
		return temp;
	}

}
