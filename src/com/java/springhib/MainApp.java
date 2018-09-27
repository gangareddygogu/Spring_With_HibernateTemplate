package com.java.springhib;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		EmpDaoImpl emp=(EmpDaoImpl)context.getBean("empdao");
		Employee e=new Employee();
		e.setUsername("reddy");
		e.setPassword("reddy1234");
		e.setId(121);
		emp.insert(e);
	}
}
