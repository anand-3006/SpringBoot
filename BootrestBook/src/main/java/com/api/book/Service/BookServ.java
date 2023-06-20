package com.api.book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.Entity.Book;
import com.api.book.Repository.Bookrepo;

@Service
public class BookServ {
	@Autowired
	private Bookrepo bookrepo;
	
	//get allbook 
	public List<Book> getAll(){
		List<Book> findAll = (List<Book>)this.bookrepo.findAll();
		return findAll;
	}
	
	//get book by id
	
	public Book getBookbyId(int id) {
		Book book=null;
		try {
			book= this.bookrepo.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//add new book
	public Book addBook(Book b) {
		Book save = this.bookrepo.save(b);
		return save;
	}
	
	//deleting book from db
	public void deleteBook(int id) {
	this.bookrepo.deleteById(id);
	}
	
	//Update book from db
	
	public void updateBook(Book book,int id) {
		book.setId(id);
		bookrepo.save(book);
	}
}
