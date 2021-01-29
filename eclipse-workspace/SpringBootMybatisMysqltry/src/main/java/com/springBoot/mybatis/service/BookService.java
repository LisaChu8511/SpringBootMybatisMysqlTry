package com.springBoot.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.mybatis.mapper.BookMapper;
import com.springBoot.mybatis.model.BookVO;

@Service
public class BookService {
	
	
	@Autowired
	BookMapper bmpr;
	
	public Object insertBook(BookVO bvo) {
		bmpr.insertBook(bvo);
		return bmpr;
	}
	
	public void updateBook(BookVO bvo) {
		bmpr.updateBook(bvo);
	}
	
	public void deleteBook(int bookid) {
		bmpr.deleteBook(bookid);
	}
	
	public Object getAllBook() {
		return bmpr;
	}
	
	public Object getOneBook(int bookid) {
		return bmpr.getOneBook(bookid);
	}

}