package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDao employeeDAO;
	
	// inject employee DAO(use constructor injection)
	@Autowired
	public EmployeeRestController(EmployeeDao theEmployeeDao) {
		employeeDAO = theEmployeeDao;
	}
	
	//expose "/employees" and return list of employee
	@GetMapping("/employees")
	public List<Employee>findAll(){
		return employeeDAO.findAll();
	}
	
}
