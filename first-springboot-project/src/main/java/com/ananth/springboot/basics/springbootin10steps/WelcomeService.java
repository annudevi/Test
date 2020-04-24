package com.ananth.springboot.basics.springbootin10steps;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveWelcomeMessage() {

		return "welcomeservice pgm from base package";

	}
}
