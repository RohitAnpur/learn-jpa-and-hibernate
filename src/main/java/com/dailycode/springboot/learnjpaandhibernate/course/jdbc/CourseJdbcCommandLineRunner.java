package com.dailycode.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dailycode.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Learn AWS Now","Daily Code"));
		repository.insert(new Course(2,"Learn Azure Now","Daily Code"));
		repository.insert(new Course(3,"Learn GCP Now","Daily Code"));
		
		repository.deleteById(1);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}
	
	

}
