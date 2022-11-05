package com.java.springboot.startup;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppConfig {

	@Bean(name="myHaiDAO")
	public HaiDAO getHaiDAO() {
		return new HaiDAO();
	}
	
	@Bean(name="myHaiService")
	public HaiService getHaiService() {
		return new HaiService();
	}
}
