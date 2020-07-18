package com.theabhieye.DemoMVC.service;

import java.util.List;

import com.theabhieye.DemoMVC.models.Emp;

public interface EmpService {
	
	public List<Emp> getAllEmp();
	public Emp getEmpById(Long id);
	public void deleteEmp(Long id);
	public void saveEmp(Emp emp);
	public void updateEmp(Emp emp);
	public List<Emp> searchEmp(String name);
}
