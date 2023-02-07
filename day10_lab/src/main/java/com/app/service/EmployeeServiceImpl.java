package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional//readOnly:false

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public List<Employee> getAllEmpDetails() {
		
		
	
		return empRepo.findAll();
	}
	@Override
	public Employee addEmpDetails(Employee transientEmp) {
	
		
		return empRepo.save(transientEmp);
	}

}
