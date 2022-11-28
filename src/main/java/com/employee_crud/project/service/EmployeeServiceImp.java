package com.employee_crud.project.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee_crud.project.model.Employee;
import com.employee_crud.project.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	} 

	@Override
	public void saveEmployee(Employee emplyoee) {
		 employeeRepository.save(emplyoee);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional =employeeRepository.findById(id);
		Employee employee =null;
		if(optional.isEmpty()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id : "+id);
		}
		return employee;
	}

	

}
