package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	List<User> list = new ArrayList<>(Arrays.asList(new User(1,"atul","atul@abc.com"),
													new User(2,"vipul","vipul@abc.com"),
													new User(3,"kamal","kamal@xyz.com")));

	@GetMapping
	public List<User> getUsersList(){
		return list;
	}
	
	@PostMapping("/add")
	public User adduser(@RequestBody User user) {
		list.add(user);
		return user;
	}
	
}
