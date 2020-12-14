package com.bridgelabz.greet.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greet.model.Greeting;
import com.bridgelabz.greet.model.User;
import com.bridgelabz.greet.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {
	public static final String template = "Hello, %s!";	// gives message
	public final AtomicLong counter = new AtomicLong();	// to increment the id

	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreetingById(long id) {

		return greetingRepository.findById(id).get();
	}

}
