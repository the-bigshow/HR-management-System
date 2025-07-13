package com.hr.service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;

import com.hr.entity.CreatePost;
import com.hr.entity.Employee;
import com.hr.repository.EmployeeRepo;
import com.hr.repository.CreatePostRepo;

@Service
public class HrService {
@Autowired	
private EmployeeRepo employeeRepo;
@Autowired
private CreatePostRepo createPostRepo;

public Employee addEmployee(Employee employee) {
	Employee save=employeeRepo.save(employee);
	return save;
}
public List<Employee> getAllEmployee(){
	List<Employee> findAll=employeeRepo.findAll();
	return findAll;
	}
public CreatePost addPost(CreatePost createPost) {
	CreatePost save=createPostRepo.save(createPost);
	return save;
}

}
