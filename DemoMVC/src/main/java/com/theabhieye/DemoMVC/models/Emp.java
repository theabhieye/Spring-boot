package com.theabhieye.DemoMVC.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
//@Table(name="emp", catalog="springboot")
public class Emp implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
//	@Column(name="emp")
	private Long empId;
//	@Column(name="name")
	private String name;
//	@Column(name="income")
	private double income;

	
	public Emp() {
		super();
		
	}

	public Emp(Long empId, String name, double income) {
		super();
		this.empId = empId;
		this.name = name;
		this.income = income;
	}

	
	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", income=" + income + "]";
	}
	
}
