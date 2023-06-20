package com.api.book.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author auth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auth=" + auth + "]";
	}
	
	 
}
