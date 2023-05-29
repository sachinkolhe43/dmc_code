package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VendorRepository;
import com.example.model.Vendor;

@Service
public class VendorService 
{
	@Autowired
	VendorRepository repo;
	
	
	
	public boolean isvalid(String email,String password)
	{
		
		List<Vendor> listV = repo.findByEmailAndPassword(email,password);
	
		if(listV.isEmpty())
		{
			return false;
		}
		
		
		return true;
		
	}
		
	

}
