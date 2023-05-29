package com.vendorNadmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vendorNadmin.Entity.Vendor;
import com.vendorNadmin.Repository.VendorRepository;
import com.vendorNadmin.Service.VendorService;
@Controller
public class VendorController {
	
	@Autowired
	VendorRepository vendorRepo;
	
	@Autowired
	VendorService vendorService;
	
	@PostMapping("/login")
	public String validate(@RequestParam String email,@RequestParam String password,Model model)
	{
		System.out.println(email);
		System.out.println(password);
		boolean valid=vendorService.isValid(email, password);
		if(valid==true)
		{
			String role="";
			System.out.println("In first if");
			List<Vendor> listV=vendorRepo.findByEmailAndPassword(email, password);
			
			for(Vendor v : listV)
			{
				role=v.getRole();
			}
			System.out.println(role);
			
			if(role.equals("Admin"))
			{
				System.out.println("In Admin");
				List<Vendor> adminList=vendorRepo.findAll();
				for(Vendor al:adminList)
				{
					String adminName=al.getName();
					model.addAttribute("adminName","Welcome"+" "+"Admin"+adminName);
				}
				model.addAttribute("vdata",adminList);
				return "adminLogin";
			}
			
			if(role.equals("vendor"))
			{
				model.addAttribute("dataV",listV);
				for(Vendor vv:listV)
				{
					model.addAttribute("name","Welcome"+" "+ vv.getName());
				}
				return "vendorLogin";
			}
				
			
			
		}
		return "redirect:/login.html";
	}
	
	@PostMapping("/register")
	public String register(Vendor vendor)
	{
		System.out.println("Saved");
		vendorRepo.save(vendor);
		return "redirect:/login.html";
	}
	
	@PostMapping("/addVendor")
	public String addVendor()
	{
		return "addVendor";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value = "id") int id , Model model)
	{
		Vendor vendor=vendorService.getVendorById(id);
		model.addAttribute("vendor",vendor);
		return "update_vendor";
		
	}
	@GetMapping("/deleteVendor/{id}")
	public String deleteVendor(@PathVariable (value = "id") int id)
	{
		this.vendorRepo.deleteVendorById(id);
		return "redirect:/login.html";
	}

}
