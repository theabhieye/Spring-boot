package com.theabhieye.DemoMVC.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theabhieye.DemoMVC.dao.EmpDAO;
import com.theabhieye.DemoMVC.models.Emp;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<Emp> getAllEmp() { 
		//Working 
		return (List<Emp>) empDAO.findAll();
	}

	@Override
	public Emp getEmpById(Long id) {
		//Working
		Optional<Emp> e=empDAO.findById(id);
		return e.get();
	}

	@Override
	public void deleteEmp(Long id) {
		empDAO.deleteById(id);
	}

	@Override 
	public void saveEmp(Emp emp) {
		//Working
		empDAO.save(emp);
	}

	@Override
	public void updateEmp(Emp emp) {
		Emp e =  this.getEmpById(emp.getEmpId());
		e.setIncome(emp.getIncome());
		e.setName(emp.getName());
		empDAO.save(e);
	}

	@Override
	public List<Emp> searchEmp(String name) {
		System.out.println(name);
		System.out.println(empDAO.searchEmp(name));
		return empDAO.searchEmp(name);
	}
	
	
}
