package com.springBoot.mybatis.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.springBoot.mybatis.model.BookVO;

@Mapper
public interface BookMapper {
	
	@Insert("INSERT INTO book(BOOKID,NAME,AUTHOR) VALUES(#{bookid},#{name},#{author})")
	public void insertBook(BookVO bvo);
	
	@Update("UPDATE book set NAME=#{name},AUTHOR=#{author} WHERE BOOKID=#{bookid}")
	public void updateBook(BookVO bvo);
	
	@Delete("DELETE FROM book WHERE BOOKID=#{bookid}")
	public void deleteBook(int bookid);
	
	@Select("SELECT * FROM book")
	public List<BookVO> getAllBook();
	
	@Select("SELECT * FROM book WHERE bookid=#{bookid}")
	public BookVO getOneBook(int bookid);
}

