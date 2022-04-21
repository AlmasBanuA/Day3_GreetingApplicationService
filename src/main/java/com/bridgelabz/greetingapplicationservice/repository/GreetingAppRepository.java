package com.bridgelabz.greetingapplicationservice.repository;

import com.bridgelabz.greetingapplicationservice.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {};

