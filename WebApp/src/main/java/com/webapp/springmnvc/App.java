package com.webapp.springmnvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	     ACInterface auto=(ACInterface)context.getBean("callbean");
	     auto.add(); 

	}

}
