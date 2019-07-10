package com.springdemo;

public class TableTennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TableTennisCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Serve 100 times!";
	}

	@Override
	public String getDailyFortune() {
		return "Come on, do it: "+ this.fortuneService.randomFortune();
	}
	
}
