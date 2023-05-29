package com.vendorNadmin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vendorNadmin.Entity.Vendor;
import com.vendorNadmin.Repository.VendorRepository;

@Service
public class VendorService {
	
	@Autowired
	VendorRepository vendorRepo;
	
	public boolean isValid(String email,String password)
	{
		List<Vendor> listV=vendorRepo.findByEmailAndPassword(email, password);
		if(listV.isEmpty())
		{
			return false;
		}
		return true;
	}
	
	public Vendor getVendorById(int id)
	{
		Optional<Vendor> optional=vendorRepo.findById(id);
		Vendor vendor = null;
		if(optional.isPresent())
		{
			vendor=optional.get();
		}
		else
		{
			throw new RuntimeException("Employee Not Found for id:"+id);
		}
		return vendor;
	}
	@Transactional
	public void deleteVendorById(int id)
	{
		this.vendorRepo.deleteById(id);
		
	}
	

}
