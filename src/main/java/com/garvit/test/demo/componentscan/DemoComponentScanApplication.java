package com.garvit.test.demo.springtest;

import com.garvit.test.demo.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.garvit.test.demo.componentscan")
public class DemoComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoComponentScanApplication.class);

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(DemoComponentScanApplication.class, args);

		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		System.out.println(componentDao);

		LOGGER.info("{}", componentDao);

	}

}
