package com.tutorialspoint.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tutorialspoint.entity.Employee;
import com.tutorialspoint.service.EmployeeService;
@RestController
@RequestMapping(path="/emp")
public class EmployeeController {
   @Autowired
   EmployeeService employeeService;
   
 /*  @GetMapping("/hello")
   public String hello()
   {
	   return "Hello World";
   }

 */


 @GetMapping("/allMyEmployees")
 public List<Employee> getAllMyEmployees(@RequestParam(required = false) String title){
     return employeeService.getAllMyEmployees(title); 
 }


 @GetMapping("/employees")
 public List<Employee> getAllEmployees(){
     return employeeService.getAllEmployees();
 }


   @GetMapping("/employee/{id}")
   public Employee getEmployee(@PathVariable("id") int id) {
      return employeeService.getEmployeeById(id);
   }
   @DeleteMapping("/employee/{id}")
   public void deleteEmployee(@PathVariable("id") int id) {
      employeeService.deleteEmployeeById(id);
   }
   @PostMapping("/employee")
   public void addEmployee(@RequestBody Employee employee) {
      employeeService.saveOrUpdate(employee);   
   }
    @PutMapping("/employee")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
    }
}