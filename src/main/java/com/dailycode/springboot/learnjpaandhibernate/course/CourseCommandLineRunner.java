package com.dailycode.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dailycode.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	/*
	 * @Autowired CourseJdbcRepository repository;
	 */
	
	/*
	 * @Autowired CourseJpaRepository repository;
	 */
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Learn AWS Now","Daily Code"));
		repository.save(new Course(2,"Learn Azure Now","Daily Code"));
		repository.save(new Course(3,"Learn GCP Now","Daily Code"));
		
		repository.deleteById(1L);
		
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(3L));
		
	}
	
	

}
