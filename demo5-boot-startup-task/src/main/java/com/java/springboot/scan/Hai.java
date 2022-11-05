package com.java.springboot.scan;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Hai {

	@Autowired(required= false)
	JdbcTemplate jTemp;
	
	@Autowired(required = false)
	DataSource ds;
	
	public Hai() {
		System.out.println("Hai...............");
		System.out.println("A.."+jTemp);
		System.out.println("B.."+ds);
	}
}
