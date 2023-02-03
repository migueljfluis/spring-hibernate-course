package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortuneStringArray = {"Good luck!", "Do your best!", "Boa sorte!"};
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		return fortuneStringArray[random.nextInt(fortuneStringArray.length)];
	}

}
