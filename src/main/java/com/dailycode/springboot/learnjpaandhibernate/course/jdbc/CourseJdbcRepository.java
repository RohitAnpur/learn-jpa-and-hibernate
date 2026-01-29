package com.dailycode.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJbJdbcTemplate;
	
	private static String INSERT_QUERY = """
						insert into course(id,name,author)
			values(1,'Learn AWS', 'Dailycode');
						""";
	
	public void insert() {
		springJbJdbcTemplate.update(INSERT_QUERY);
	}

}
