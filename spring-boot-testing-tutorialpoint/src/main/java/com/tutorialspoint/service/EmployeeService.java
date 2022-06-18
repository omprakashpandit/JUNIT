package com.tutorialspoint.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialspoint.entity.Employee;
import com.tutorialspoint.repository.EmployeeRepository;
@Service
public class EmployeeService {
   @Autowired
   EmployeeRepository repository;

   //OM PRAKASH

   public List<Employee> getAllMyEmployees(String title ){
      List<Employee> employees = new ArrayList<Employee>();
      if(title == null) {
         repository.findAll().forEach(employees::add);
      }else {
         repository.findByIdContaining(title).forEach(employees::add);
      }
      return employees;
   }

//
   public Employee getEmployeeById(int id) {
      return repository.findById(id).get();
   }


   public List<Employee> getAllEmployees() {
      List<Employee> employees = new ArrayList<Employee>();
       repository.findAll().forEach(employee -> employees.add(employee));
       return employees;
   }


   public void saveOrUpdate(Employee employee) {
      repository.save(employee);
   }
   public void deleteEmployeeById(int id) {
      repository.deleteById(id);
   }
}