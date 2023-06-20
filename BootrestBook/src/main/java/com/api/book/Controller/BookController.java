//package com.api.book.Controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.api.book.Entity.Book;
//import com.api.book.Service.BookService;
//
//@Controller
//public class BookController {
//	
//	@Autowired
//	private BookService bookService;
//	//get all books from list
////	@RequestMapping(value = "/booking",method = RequestMethod.GET)
////	@GetMapping("/booking")
////	public List<Book> Books() {
////		System.out.println("postman is working");
////		List<Book> allBooks = this.bookService.getAllBooks();
////		System.out.println(allBooks);
////		return allBooks;
////	}
//	
//	//getting all books and handling HttpStatus code
//	@GetMapping("/booking")
//	public ResponseEntity<List<Book>> handle(){
//		List<Book> a = bookService.getAllBooks();
//		if(a.size()==0) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		return ResponseEntity.of(Optional.of(a));
//	}
//	
//	
//	//get book by perticulare id
//	
////	@GetMapping("/booking")
////	public Book handler() {
////		return this.bookService.getBookById(12);
////	}
//	
//	//Another way to fetch book by id
////	@GetMapping("/booking/{id}")
////	public Book handle(@PathVariable("id") int id) {
////		return bookService.getBookById(id);
////	}
//	
//	//get book id and handling http status code
//	@GetMapping("/booking/{id}")
//	public ResponseEntity<Book> get(@PathVariable("id")int id){
//		Book book=bookService.getBookById(id);
//		
//		if(book==null) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		return ResponseEntity.of(Optional.of(book));
//	}
//	
//	//adding a new book into list
////	@RequestMapping(value = "/booking",method = RequestMethod.POST)
////	public Book adding(@RequestBody Book b2) {
////		Book as = this.bookService.add(b2);
////		System.out.println(as);
////		return as;
////	}
//	
//	//adding a new book and handling Http status
//	@PostMapping("/booking")
//	public ResponseEntity<Book> add(@RequestBody Book b1){
//		Book as=bookService.add(b1);
//		if(as==null) {
//			return ResponseEntity.status(HttpStatus.CREATED).build();
//		}
//		return ResponseEntity.of(Optional.of(as));
//	}
//	
//	//deleting book from list
////	@DeleteMapping("/booking/{id}")
////	public void delete(@PathVariable("id") int bookid) {
////	this.bookService.DeleteBook(bookid);
////	}
//	
//	//handling Https status and deleting book
//	@DeleteMapping("/booking/{id}")
//	public ResponseEntity<Void> delete(@PathVariable("id")int bookid){
//		try {
//			this.bookService.DeleteBook(bookid);
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
//		}
//	}
//	
//	
//	//to update the book
////	@PutMapping("/booking/{id}")
////	public Book update(@RequestBody Book book,@PathVariable("id")int id) {
////		this.bookService.updateBook(book, id);
////		
////		return book;
////	}
//	
//	//updating book and handling httpstatus code
//	@PutMapping("/booking/{id}")
//	public ResponseEntity<Book> update(@RequestBody Book book,@PathVariable("id")int id){
//		try {
//			this.bookService.updateBook(book, id);
//			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//		
//	}
//	
//}
