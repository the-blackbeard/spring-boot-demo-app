package com.garvit.test.demo.springtest;

import com.garvit.test.demo.springtest.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoCdiApplication.class);

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(DemoCdiApplication.class, args);

		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
	}

}
