package com.bridgelabz.greet.service;

import com.bridgelabz.greet.model.Greeting;
import com.bridgelabz.greet.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
}
