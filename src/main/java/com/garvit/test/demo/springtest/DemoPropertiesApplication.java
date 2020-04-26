package com.garvit.test.demo.springtest;

import com.garvit.test.demo.springtest.basic.BinarySearchImpl;
import com.garvit.test.demo.springtest.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app.properties")
@SpringBootApplication
public class DemoPropertiesApplication {

	public static void main(String[] args) {


		//System.out.println(result);

		ApplicationContext applicationContext = SpringApplication.run(DemoPropertiesApplication.class, args);

		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);


		System.out.println(service.returnServiceUrl());

	}

}
