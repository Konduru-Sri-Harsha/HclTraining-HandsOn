package com.hcl4.dao;

import java.util.List;

import com.hcl4.model.Employee;

public interface Empdao {
	boolean insert(Employee emp);
	boolean delete(int eno);
	Employee get(int eno);
	List<Employee> getAll();
}
