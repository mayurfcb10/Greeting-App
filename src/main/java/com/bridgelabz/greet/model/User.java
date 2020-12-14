package com.bridgelabz.greet.model;

public class User {
	private String firstName;
	private String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		String str = (firstName != null) ? firstName + " " : "";
		str += (lastName != null) ? lastName : "";
		return str.trim();
	}

}
