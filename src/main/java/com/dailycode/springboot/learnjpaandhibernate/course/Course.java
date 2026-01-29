package com.dailycode.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	 //@GeneratedValue this case for testing debug knowledge.
	//https://medium.com/@sicamaluks2014/understanding-and-fixing-the-row-was-updated-or-deleted-by-another-transaction-error-in-spring-e31309549fe2
	//@GeneratedValue	
	private long id;
	private String name;
	private String author;
	
	public Course() {
		
	}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	

}
