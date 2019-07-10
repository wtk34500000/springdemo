package com.springdemo;

public class CriketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CriketCoach() {
		System.out.println("inside no-arg cnstructor");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You Did it: " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService myFortuneService) {
		System.out.println("inside setting method - setFortuneService");

		this.fortuneService=myFortuneService;
	}

}
