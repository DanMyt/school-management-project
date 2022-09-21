package com.example.schoolmanagementproject;

import com.example.schoolmanagementproject.student.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SchoolManagementProjectApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final ServiceStudent s = this.context.getBean(ServiceStudent.class);
		System.out.println(s);
	}
}
