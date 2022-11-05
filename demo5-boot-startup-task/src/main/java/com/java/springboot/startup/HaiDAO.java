package com.java.springboot.startup;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class HaiDAO {
	
	@Autowired(required= false)
	JdbcTemplate jTemp;
	
	@Autowired(required = false)
	DataSource ds;
	
	public HaiDAO() {
		System.out.println("HaiDAO...............");
		System.out.println("A.."+jTemp);
		System.out.println("B.."+ds);
	}

}
