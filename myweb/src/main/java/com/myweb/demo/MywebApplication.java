package com.myweb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MywebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebApplication.class, args);
		Mydemo mydemo = new Mydemo();
		mydemo.mymethod();
	}

}
