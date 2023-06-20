package com.api.book.Repository;

import org.springframework.data.repository.CrudRepository;

import com.api.book.Entity.Book;

public interface Bookrepo extends CrudRepository<Book, Integer>{
public Book findById(int id);
}
