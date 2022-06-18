package com.tutorialspoint.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.tutorialspoint.CurdSpringBootApplication;
import com.tutorialspoint.entity.Employee;
@ExtendWith(SpringExtension.class)

@SpringBootTest(classes = CurdSpringBootApplication.class)
public class EmployeeServiceTest {
   @MockBean
   private EmployeeService employeeService;
   @Test
   public void testGetAllEmployees() throws Exception {
      Employee employee = getEmployee();
      List<Employee> employees = new ArrayList<>();
      employees.add(employee);
      given(employeeService.getAllEmployees()).willReturn(employees);
      List<Employee> result = employeeService.getAllEmployees();
      assertEquals(result.size(), 1);
   }
   @Test
   public void testGetEmployee() throws Exception {
      Employee employee = getEmployee();
      given(employeeService.getEmployeeById(1)).willReturn(employee);
      Employee result = employeeService.getEmployeeById(1);
      assertEquals(result.getId(), 1);	
   }
   @Test
   public void testDeleteEmployee() throws Exception {
      doNothing().when(employeeService).deleteEmployeeById(1);
      employeeService.deleteEmployeeById(1);
      assertTrue(true);
   }
   @Test
   public void testSaveOrUpdateEmployee() throws Exception {
      Employee employee = getEmployee();
      doNothing().when(employeeService).saveOrUpdate(employee);	
      employeeService.saveOrUpdate(employee);
      assertTrue(true);
   }
   private Employee getEmployee() {
      Employee employee = new Employee();
      employee.setId(1);
      employee.setName("Mahesh");
      employee.setAge(30);
      employee.setEmail("mahesh@test.com");
      return employee;
   }
}
