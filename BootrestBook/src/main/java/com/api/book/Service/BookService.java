//package com.api.book.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.api.book.Entity.Book;
//@Service
//public class BookService {
//
//	
//	private static List<Book> list=new ArrayList<>();
//	
//	//adding books into list
//	
//	static {
//		list.add(new Book(12,"Mahabharat","Vyas"));
//		list.add(new Book(14,"Ramayan","Valmiki"));
//		list.add(new Book(16,"Hanuman Chalisa","Tulasi das"));
//	}
//	//methos to get all books from list
//	public List<Book> getAllBooks(){
//		return list;
//	}
//	//method to get book using perticular id
//	public Book getBookById(int id){
//		Book a1=null;
//		try {
//		a1=list.stream().filter(e->e.getId()==id).findFirst().get();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return a1;
//	}
//	
//	
//	//method to add new book to list
//	public Book add(Book b1) {
//	list.add(b1);
//		return b1;
//	}
//	
//	
//	//method to delete book from list
//	public void DeleteBook(int bookid) {
//		list=list.stream().filter(book->book.getId()!=bookid).collect(Collectors.toList());
//	}
//	
//	//update book
//	public void updateBook(Book book,int id) {
//		list.stream().map(e->{if(e.getId()==id) {
//			e.setTitle(book.getTitle());
//			e.setAuth(book.getAuth());
//		}
//		return e;
//	}).collect(Collectors.toList());
//	
//	}
//}
//	
