package com.sachin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EmpController {
	
	@Autowired
	private EmpServiceImpl emp;
	
	@GetMapping("/")
	public String empList(Model model) {
		
		model.addAttribute("allempList", emp.getAllEmp());
		return "emp_list";
	}
	
	@GetMapping("/addnew")
	public String addNewEmployee(Model model) {
		
		Emp emp=new Emp();
		model.addAttribute("employee",emp);
		return "add_emp";
		
	}
	
	public String saveEmp(@ModelAttribute("employee") Emp emp) {
		
		
		return null;
		
	}
	
	
}
