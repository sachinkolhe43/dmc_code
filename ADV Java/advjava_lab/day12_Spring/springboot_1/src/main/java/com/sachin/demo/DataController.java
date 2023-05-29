package com.sachin.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@Autowired
	UserRepository repo;
	
	@GetMapping("/user")
	public List<User>getAllUsers()
	{
		List<User> result=repo.findAll();
		return result;
	}
	
	@PostMapping("/user")
	public String storeUser(User user)
	{
		repo.save(user);
		return "Object inserted";
	}
}
