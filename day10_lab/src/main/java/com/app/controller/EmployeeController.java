package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController //=@Controller at the class levl + @Responsebody
// added on all return types
//all request handling methods: for marshalling(serialization)-java-->json conversion
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/employees")

public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	
	public EmployeeController() {
		System.out.println("in emp controller");
	}
	
	@GetMapping
	public List<Employee> getAllEmp(){
		System.out.println("in get emp");
		return empService.getAllEmpDetails();
	}
	
	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee transientEmp) {
		System.out.println("in save emp details");
		
		return empService.addEmpDetails(transientEmp);
	}
	
	

}
