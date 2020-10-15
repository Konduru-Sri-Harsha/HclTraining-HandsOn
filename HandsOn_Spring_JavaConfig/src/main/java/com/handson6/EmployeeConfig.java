package com.handson6;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean(name="employee")
	public Employee getEmp() {
		Employee employee= new Employee();
		employee.setEmployeeName("Sathish");
		ArrayList<String> employeeMobileNumber= new ArrayList<String>();
			employeeMobileNumber.add("9566259957");
			employeeMobileNumber.add("9566259958");
			employeeMobileNumber.add("9566259959");
		employee.setEmployeeMobileNumber(employeeMobileNumber);
		employee.setEmployeeSalary(45000);
		employee.setEmployeeEmail("me@gmail.com");	
		
		return employee;
		
	}
	
	@Bean(name="address")
	public Address getAddress() {
		Address address= new Address();
		address.setLine1("2/115 AnnaNagar");
		address.setLine2("Kaveripattinam");
		address.setCity("Krishnagiri");
		address.setPinCode("635112");
		
		return address;
		
		
	}
}








