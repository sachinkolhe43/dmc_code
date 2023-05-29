package com.sachin.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpServiceImpl implements EmpService  {

	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public List<Emp> getAllEmp() {
		return empRepo.findAll();
	}

	@Override
	public void save(Emp emp) {
		
		empRepo.save(emp);
	}

	@Override
	public Emp getByID(Long id) {
		
		Optional<Emp> optional=empRepo.findById(id);
		Emp emp=null;
		if(optional.isPresent())
			emp=optional.get();	
		else
			throw new RuntimeException(
					
					"Employee not found for id: "+id);
		return emp;
	}

	@Override
	public void deleteViaId(long id) {
		
		empRepo.deleteById(id);
	}

}
