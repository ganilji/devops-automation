package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@SpringBootApplication
@RestController
@RequestMapping("/users")
public class DemoApplication {

	@GetMapping
	public List<User> getUsers(){
		return Stream.of(new User(1,"atul","atul@abc.com"),
						new User(2,"vipul","vipul@abc.com"),
						new User(3,"kamal","kamal@xyz.com"))
				.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
