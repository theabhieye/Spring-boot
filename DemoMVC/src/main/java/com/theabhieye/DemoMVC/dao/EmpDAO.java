package com.theabhieye.DemoMVC.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.theabhieye.DemoMVC.models.Emp;


public interface EmpDAO extends CrudRepository<Emp, Long>{
	@Query("select e from Emp e where e.name like %:name%")
	public List<Emp> searchEmp(@Param("name") String name);
}
