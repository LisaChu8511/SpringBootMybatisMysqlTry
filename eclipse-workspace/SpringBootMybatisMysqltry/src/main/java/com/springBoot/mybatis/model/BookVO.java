package com.springBoot.mybatis.model;

public class BookVO {
	
	private int bookid;
	private String name;
	private String author;
	
	public int getBookid() {
		return bookid;
	}
	
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public BookVO(int bookid, String name, String author) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.author = author;
	}
	
	public BookVO() {
		super();
	}
	
	public String toString() {
		return "BookVO [bookid=" + bookid + ", name=" + name +", author" + author +"]";
	}

}
