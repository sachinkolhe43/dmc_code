package com.sachin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@GetMapping("/user")
	public User displayHello()
	{
		return new User("root","password");
	}
	
	@PostMapping("/user")
	public void anotherMethod(User user)
	{
		System.out.println(user.getUserName());
		System.out.println("Running on server");
	}
	
	@PutMapping("/hello")
	public String putMethod()
	{
		return "Put executed";
	}
	
}
