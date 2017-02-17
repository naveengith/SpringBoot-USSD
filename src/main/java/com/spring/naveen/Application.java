package com.spring.naveen;

import com.spring.naveen.Model.UssdRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class Application {

	public static HashMap<Long,UssdRequest> hmStudent;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
}
