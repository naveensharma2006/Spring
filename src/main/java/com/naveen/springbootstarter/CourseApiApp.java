package com.naveen.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Annotation to tells spring boot that its starting point of application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {

		//Static class used to bootstrap and launch a spring application
		SpringApplication.run(CourseApiApp.class, args);

	}

}
