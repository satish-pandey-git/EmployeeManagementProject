package com.webdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdemo.entity.Employee;
import com.webdemo.payload.EmployeeDto;
import com.webdemo.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	private EmpRepository empRepository;
	
	public void saveEmp(Employee employee) {
		empRepository.save(employee);
	}

	public List<Employee> getAllDetails() {
		return empRepository.findAll();
		
		
	}

	public void deleteEmp(long id) {
		empRepository.deleteById(id);
		
	}

	public Employee getEmpById(long id) {
		Employee emp = empRepository.findById(id).get();
		return emp;
		
		
	}

	public void updateEmp(EmployeeDto empDto) {
		Employee emp = empRepository.findById(empDto.getId()).get();
		emp.setName(empDto.getName());
		emp.setEmail(empDto.getEmail());
		emp.setDepartment(empDto.getDepartment());
		empRepository.save(emp);
			
	}
	

}
