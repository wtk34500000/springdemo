package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		//retreve bean from spring container
//		Coach theCoach = context.getBean("myCoach", Coach.class);
//		
//		Coach alphaCoach = context.getBean("myCoach", Coach.class);
//		
//		boolean result=(theCoach == alphaCoach );
//		System.out.println(result);
//		System.out.println(theCoach);
//		System.out.println(alphaCoach);
		Coach theCoach=context.getBean("baseballCoach", Coach.class);
		Coach baseballCoach=context.getBean("baseballCoach", Coach.class);
		
		boolean result=(theCoach == baseballCoach);
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(baseballCoach);		
	}
}
