package com.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

	@Override
	public String randomFortune() {
		ArrayList<String> randArr= new ArrayList<String>();
		Random rand = new Random();
		
		randArr.add("Today is your lucky day!");
		randArr.add("Today is your bad day!");
		randArr.add("Today is your worst day!");
		randArr.add("Today is your good day!");
		
		return randArr.get(rand.nextInt(randArr.size()));
	}

}
