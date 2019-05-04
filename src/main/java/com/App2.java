package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.serveltTest.serveltDemo2;

@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
	
	@Bean
	public ServletRegistrationBean tobebean() {
		ServletRegistrationBean srb=new ServletRegistrationBean(new serveltDemo2());
		srb.addUrlMappings("/servlet2");
		return srb;
	}
}
