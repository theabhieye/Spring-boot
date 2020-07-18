package com.theabhieye.day1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.theabhieye.day1.Models.Address;
import com.theabhieye.day1.Models.Student;

@SpringBootApplication
public class Day1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Day1Application.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		
		Student st = ctx.getBean(Student.class);
		st.setId(100);
		st.setName("Abhishek kapoor");
		
		Address ad = ctx.getBean(Address.class);
		ad.setCity("jaipur");
		ad.setCountry("India");
		ad.setPlotNo(11);		
		
		st.setAdd(ad);
		
		System.out.println(st);
		
//		SpringApplication.run(Day1Application.class, args);
	}
}
