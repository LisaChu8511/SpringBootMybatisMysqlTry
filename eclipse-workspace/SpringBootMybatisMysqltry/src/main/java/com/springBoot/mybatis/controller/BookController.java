package com.springBoot.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.springBoot.mybatis.model.BookVO;
import com.springBoot.mybatis.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bservice;
	
	@PostMapping("/insertBook")
	public Object insertBook(@RequestBody BookVO bvo) {
		return bservice.insertBook(bvo);
	}
	
	@PutMapping("/updateBook")
	public void updateBook(@RequestBody BookVO bvo) {
		bservice.updateBook(bvo);
	}
	
	@DeleteMapping("/deleteBook")
	public void deleteBook(@RequestBody BookVO bvo) {
		bservice.deleteBook(bvo.getBookid());
	}
	
	@GetMapping("/getAllBook")
	public Object getAllBook() {
		return bservice.getAllBook();
	}
	
	@GetMapping("/getOneBook")
	public Object getOneBook(int bookid) {
		return bservice.getOneBook(bookid);
	}

}