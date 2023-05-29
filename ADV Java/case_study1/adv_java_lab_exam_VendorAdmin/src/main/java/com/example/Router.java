package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Vendor;
import com.example.service.VendorService;

@Controller
public class Router
{
	@Autowired
	VendorService service;
	
	@Autowired
	VendorRepository repo;
	
	
	@PostMapping("/login")
	public String validate(@RequestParam String email,@RequestParam String password,Model model)
	{
		System.out.println(email);
		System.out.println(password);
		boolean valid = service.isvalid(email,password);
		
		System.out.println(valid);
		if(valid == true)
		{
			String role="";
			System.out.println("in first if");
			List<Vendor> listV = repo.findByEmailAndPassword(email, password);
			
			for(Vendor v : listV)
			{
				role = v.getRole();
			}
			System.out.println(role);
			
			if(role.equals("admin"))
			{
				System.out.println("in admin");
				List<Vendor> vl = repo.findAll();
				for(Vendor va : vl)
				{
					String adminame = va.getName();
					model.addAttribute("adminname","Welcome"+" "+"Admin"+" "+adminame);
				}
				model.addAttribute("vdata",vl);
				
				return "adminLogin";
			}
			
			if(role.equals("vendor"))
			{
				model.addAttribute("dataV",listV);
				for(Vendor vv : listV)
				{
					model.addAttribute("name","Welcome"+" "+vv.getName());
				}
				return "vendorLogin";
			}
		}
		
		
		return "redirect:/login.html";
		
	}
	
	@PostMapping("/register")
	public String register(Vendor vendor)
	{
		repo.save(vendor);
		return "redirect:/login.html";
	}
	
	@PostMapping("/addVendor")
	public String addVendor()
	{
		return "addVendor";
	}

}
