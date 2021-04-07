package com.nexza.DemoSpring;

import model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.userRepository;


@SpringBootApplication
public class DemoSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@Autowired
	private userRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new user("dilusha","upatissa","dilu@gmail.com"));
		this.userRepository.save(new user("navod","Amarakoon","nexza@gmail.com"));


	}
}
