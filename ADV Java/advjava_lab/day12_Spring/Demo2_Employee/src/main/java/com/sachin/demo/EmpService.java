package com.sachin.demo;

import java.util.List;

public interface EmpService {
	
	List<Emp> getAllEmp();
	
	void save(Emp emp);
	
	Emp getByID(Long id);
	
	void deleteViaId(long id);
}
