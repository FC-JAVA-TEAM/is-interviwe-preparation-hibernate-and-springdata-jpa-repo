package com.example.basicSpringExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringExampleApplication {

	static Logger logger=LoggerFactory.getLogger(BasicSpringExampleApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BasicSpringExampleApplication.class, args);
	jdbcDao context = applicationContext.getBean(jdbcDao.class);
	String result = context.getConnectionName();
	System.out.println(result);
	
	jdbcDao context1 = applicationContext.getBean(jdbcDao.class);
	String result1 = context.getConnectionName();
	
	logger.info("{}",context);
	logger.info("{}",context.conn);
	
	logger.info("{}",context1);
	logger.info("{}",context1.conn);
	//context.getCourseDetailsFromInstitute("java");
//	System.err.println(context.hashCode());
//	
//	Institute context2 = applicationContext.getBean(Institute.class);
//	context2.getCourseDetailsFromInstitute("net");
//	System.err.println(context2.hashCode());
	
	}

}
