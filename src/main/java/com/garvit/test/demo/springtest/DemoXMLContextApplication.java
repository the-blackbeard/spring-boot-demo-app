package com.garvit.test.demo.springtest;

import com.garvit.test.demo.springtest.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoXMLContextApplication.class);

	public static void main(String[] args) {


		//System.out.println(result);

		try(ClassPathXmlApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("applicationContext.fxml")) {

			LOGGER.info("Bean loaded -> {}",
					(Object)applicationContext.getBeanDefinitionNames());

			XmlPersonDAO personDao=
					applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());


		}

	}

}
