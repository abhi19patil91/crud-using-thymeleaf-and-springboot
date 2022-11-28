package com.employee_crud.project.service;

import java.util.List;
import com.employee_crud.project.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee emploee);
	public Employee getEmployeeById(int id);

}
