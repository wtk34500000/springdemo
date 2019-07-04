package com.springdemo;

public class BaseballCoach implements Coach{
		
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a contructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting pratice";
	}

	@Override
	public String getDailyFortune() {
		//use my forturService to get fortune
		return fortuneService.getFortune();
	}
	
}
