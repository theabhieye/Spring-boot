package com.theabhieye.day1.Models;

import org.springframework.stereotype.Component;

@Component
public class Address {
	int plotNo;
	String city ;
	String country;
	public int getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", city=" + city + ", country=" + country + "]";
	}
	
}
