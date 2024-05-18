package com.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.MyBookList;
import com.store.repository.MyBookListRepository;

import jakarta.persistence.Entity;

@Service
public class MyBookListService {
	@Autowired
	private MyBookListRepository myBookListRepository;
	
	public void saveMyBook(MyBookList book) {
		myBookListRepository.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myBookListRepository.findAll();
	}
	
	public void deleteById(int id) {
		myBookListRepository.deleteById(id);
	}
}
