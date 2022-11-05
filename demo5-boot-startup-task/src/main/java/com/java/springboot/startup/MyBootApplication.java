package com.java.springboot.startup;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.java.springboot.scan.Hai;
import com.java.springboot.scan.Hello;

@SpringBootApplication
public class MyBootApplication implements CommandLineRunner{

	// autoconfiguration
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	JdbcTemplate jTemp;
	@Autowired
	DataSource ds;
	@Autowired
	NamedParameterJdbcTemplate npjt;
	
	// component scan
	@Autowired
	HelloDAO helloDAO;
	@Autowired
	HelloService helloService;
	@Autowired(required = false)
	Hello hello;
	@Autowired(required = false)
	Hai hai;
	
	// explicit configution
	@Autowired
	HaiDAO haiDAO;
	@Autowired
	HaiService haiService;
	
	
	
	public static void main(String[] args) {
		System.out.println("Main Begin.......................................");
		SpringApplication.run(MyBootApplication.class, args);
		System.out.println("Main END.......................................");
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("1. "+ctx);
		System.out.println("2. "+jTemp);
		System.out.println("3. "+ds);
		System.out.println("4. "+npjt);
		
		System.out.println("7. "+hello);
		System.out.println("8. "+hai);
		System.out.println("9. "+haiDAO);
		System.out.println("10. "+haiService);
		
		System.out.println("5. "+helloDAO);
		System.out.println("6. "+helloService);
		
	}

}
