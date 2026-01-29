package com.dailycode.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dailycode.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJbJdbcTemplate;
	
	private static String INSERT_QUERY = """
						insert into course(id,name,author)
			values(?,?,?);
						""";
	
	private static String DELETE_QUERY = """
			delete from course where id = ?;
			""";
	
	public void insert(Course course) {
		springJbJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long  id) {
		springJbJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	

}
