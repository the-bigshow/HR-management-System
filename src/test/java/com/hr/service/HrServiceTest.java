package com.hr.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;

import com.hr.entity.Employee;
import com.hr.repository.CreatePostRepo;
import com.hr.repository.EmployeeRepo;


public class HrServiceTest {
@Mock
private EmployeeRepo employeeRepo;
@Mock
private CreatePostRepo createPostRepo;

@InjectMocks
private HrService hrService;

@BeforeEach
void setUp() {
	MockitoAnnotations.openMocks(this);
	
}
@Test
void testaddEmployee() {
	Employee employee=new Employee();
	employee.setId(1);
	employee.setEmployeeName("Ayush");
	employee.setEmail("ayush.gla_cs22@gla.ac.in");
	when(employeeRepo.save(employee)).thenReturn(employee);
	Employee saveEmployee=hrService.addEmployee(employee);
	verify(employeeRepo).save(employee);
	assertEquals(employee,saveEmployee);
	
}
@Test
 void testGetAllEmployee() {
	 List<Employee> employeeList=new ArrayList<>();
	 Employee employee=new Employee();
		employee.setId(1);
		employee.setEmployeeName("Ayush");
		employee.setEmail("ayush.gla_cs22@gla.ac.in");
		
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setEmployeeName("Akash");
		employee2.setEmail("akash2221@gmail.com");
		
		employeeList.add(employee2);
		employeeList.add(employee2);
		
		when(employeeRepo.findAll()).thenReturn(employeeList);
		List<Employee> result=hrService.getAllEmployee();
		assertEquals(employeeList,result);
		
	 
 }

}
