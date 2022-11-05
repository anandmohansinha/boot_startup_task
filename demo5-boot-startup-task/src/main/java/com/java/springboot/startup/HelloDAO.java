package com.java.springboot.startup;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDAO {

	@Autowired
	JdbcTemplate jTemp;
	
	@Autowired
	DataSource ds;
	
	public HelloDAO() {
		System.out.println("HelloDAO.........");
		System.out.println("A.  "+ jTemp);
		System.out.println("B.   "+ds);
		
	}
}
