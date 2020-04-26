package com.garvit.test.demo.springtest;

import com.garvit.test.demo.springtest.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoScopeApplication.class);

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(DemoScopeApplication.class, args);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);

		System.out.println(personDao);
		System.out.println(personDao1);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());

	}

}
