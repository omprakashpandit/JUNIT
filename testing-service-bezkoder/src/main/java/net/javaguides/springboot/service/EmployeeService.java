package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    
	 Optional<Employee> getEmployeeByName(String name);
	
	Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee updatedEmployee);
    //void deleteEmployee(long id);
}
