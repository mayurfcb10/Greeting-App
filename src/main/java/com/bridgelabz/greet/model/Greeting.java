package com.bridgelabz.greet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GREETINGS")
public class Greeting {
	@Id
	private long greetingId;
	private String message;

	public Greeting(long greetingId, String message) {
		this.greetingId = greetingId;
		this.message = message;
	}

	public Greeting() {
		super();
	}

	public long getGreetingId() {
		return greetingId;
	}

	public void setGreetingId(long greetingId) {
		this.greetingId = greetingId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
