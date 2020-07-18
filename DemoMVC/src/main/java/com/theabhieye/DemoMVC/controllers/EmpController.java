package com.theabhieye.DemoMVC.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theabhieye.DemoMVC.models.Emp;
import com.theabhieye.DemoMVC.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	EmpService empService;

	@GetMapping("/getEmpById/{empId}")
	public ResponseEntity<Emp> getEmpByid(@PathVariable("empId") Long id) {
		Emp e = empService.getEmpById(id);
		return new ResponseEntity<Emp>(e, HttpStatus.OK);
	}

	@GetMapping("/getAllEmp")
	public ResponseEntity<List<Emp>> getAllEmp() {
		return new ResponseEntity<List<Emp>>(empService.getAllEmp(), HttpStatus.OK);
	}

	@PostMapping("/saveEmp")
	public ResponseEntity<Void> saveEmp(@RequestBody Emp emp) {
		empService.saveEmp(emp);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping("/updateEmp")
	public ResponseEntity<Void> editEmp(@RequestBody Emp emp) {
		Emp d = new Emp();
		empService.updateEmp(emp);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/deleteEmp/{empId}")
	public ResponseEntity<Void> deleteEmp(@PathVariable("empId") Long id) {
		empService.deleteEmp(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/search/{name}")
	public ResponseEntity<List<Emp>> search(@PathVariable("name") String name){
		
		return new ResponseEntity<List<Emp>>(empService.searchEmp(name),HttpStatus.OK);
	}
}
