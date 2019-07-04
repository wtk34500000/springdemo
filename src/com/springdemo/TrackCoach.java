package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneSerice;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneSerice) {
		this.fortuneSerice = fortuneSerice;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: "+ fortuneSerice.getFortune();
	}

}
