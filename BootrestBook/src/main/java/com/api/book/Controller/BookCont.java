package com.api.book.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.book.Entity.Book;
import com.api.book.Service.BookServ;

@Controller
public class BookCont {
	
	@Autowired
	private BookServ bookServ;
	
	//getting all books from DB
//	@GetMapping("/book")
//	public List<Book> getAllBook(){
//		List<Book> all = this.bookServ.getAll();
//		return all;
//	}
	
	//getting allbooks from DB and handling Httpstatus code
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBook(){
		List<Book> all = bookServ.getAll();
		if(all.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(all));
	}
	
	//getting book by id
	
//	@GetMapping("/book/{id}")
//	public Book bookById(@PathVariable("id")int id) {
//		return this.bookServ.getBookbyId(id);
//	}

	//Getting book by id and handling Httpstatus code
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> byId(@PathVariable("id")int id){
		Book bookbyId = bookServ.getBookbyId(id);
		if(bookbyId==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bookbyId));
	}
	
	//adding a new book into DB
//	@PostMapping("/book")
//	public Book addingBook(@RequestBody Book B) {
//		Book addBook = this.bookServ.addBook(B);
//		return addBook;
//	}
	
	//adding a new Book intop DB and Handling Httpstatus code
	@PostMapping("/book")
	public ResponseEntity<Book> add(@RequestBody Book b){
		Book as = bookServ.addBook(b);
		if(as==null) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.of(Optional.of(as));
	}
	
	//deleting the book from DB
	
//	@DeleteMapping("/book/{id}")
//	public void delete(@PathVariable("id")int id) {
//		this.bookServ.deleteBook(id);
//	}
	
	//deleting the book from DB and Handling Httpstatus code
	
	@DeleteMapping("/book/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id")int id){
		try {
			this.bookServ.deleteBook(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//Updating Book from DB
	
//	@PutMapping("/book/{id}")
//	public Book Update(@PathVariable("id")int id,@RequestBody Book bo) {
//		this.bookServ.updateBook(bo, id);
//		return bo;
//	}
	
	@PutMapping("/book/{id}")
	public ResponseEntity<Book> update(@PathVariable("id")int id,@RequestBody Book book){
		try {
			this.bookServ.updateBook(book, id);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
