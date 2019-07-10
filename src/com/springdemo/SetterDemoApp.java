package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CriketCoach myCriketCoach = context.getBean("myCriketCoach", CriketCoach.class);
		
		// call methods on the bean
		System.out.println(myCriketCoach.getDailyWorkout());

		System.out.println(myCriketCoach.getDailyFortune());
		
		//call our new methods to get the literal values
		System.out.println(myCriketCoach.getEmailAddress());
		System.out.println(myCriketCoach.getTeam());


				
		// close the context
		context.close();
	}

}
