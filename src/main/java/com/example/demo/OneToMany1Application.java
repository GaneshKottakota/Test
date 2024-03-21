package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.CommonService;

@SpringBootApplication
public class OneToMany1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToMany1Application.class, args);
		
		                           CommonService bean = context.getBean(CommonService.class);
		                                              bean.saveEmployee();
		
		
		
	}

}
