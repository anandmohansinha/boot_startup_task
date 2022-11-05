package com.java.springboot.startup;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Autowired(required= false)
	JdbcTemplate jTemp;
	
	@Autowired(required = false)
	DataSource ds;
	
	public HelloService() {
		System.out.println("HelloService...............");
		System.out.println("A.."+jTemp);
		System.out.println("B.."+ds);
	}

	
	
}
