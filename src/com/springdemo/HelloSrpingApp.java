package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSrpingApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach baseCoach = context.getBean("yourCoach", Coach.class);
		Coach tableTennisCoach = context.getBean("tableTennisCoach", Coach.class);
		
		//call methods on the bean
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(baseCoach.getDailyWorkout());
//		System.out.println(tableTennisCoach.getDailyWorkout());
		
		//let call our new method for fortune
		System.out.println(baseCoach.getDailyFortune());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(tableTennisCoach.getDailyFortune());

		

		//close the context
		context.close();
	}

}
