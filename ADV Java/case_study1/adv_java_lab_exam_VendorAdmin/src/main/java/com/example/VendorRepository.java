package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer>
{

	public List<Vendor> findByEmailAndPassword(String email,String password);	
		
	
}
