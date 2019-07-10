package com.springdemo;

public class CriketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CriketCoach: inside setter method - setEmailAddress");

		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CriketCoach: inside setter method - setTeam");

		this.team = team;
	}

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
		return "You Did it: " + this.fortuneService.randomFortune();
	}
	
	public void setFortuneService(FortuneService myFortuneService) {
		System.out.println("inside setting method - setFortuneService");

		this.fortuneService=myFortuneService;
	}

}
