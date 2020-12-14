package com.bridgelabz.greet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.greet.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
