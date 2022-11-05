package com.java.springboot.scan;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Hello {

	@Autowired(required= false)
	JdbcTemplate jTemp;
	
	@Autowired(required = false)
	DataSource ds;
	
	public Hello() {
		System.out.println("Hello...............");
		System.out.println("A.."+jTemp);
		System.out.println("B.."+ds);
	}
	
}
