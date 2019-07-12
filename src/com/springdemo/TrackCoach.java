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
		
		return "Just do it: "+ this.fortuneSerice.randomFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside init method");
	}
	//add a destory method
	public void doMyCleanupStuffyoyo() {
		System.out.println("TrackCoach: inside destory method");
	}
}
