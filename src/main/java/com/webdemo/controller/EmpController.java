package com.webdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webdemo.entity.Employee;
import com.webdemo.payload.EmployeeDto;
import com.webdemo.repository.EmpRepository;
import com.webdemo.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService empService;
	//http://localhost:8080/emp
	@RequestMapping("/emp")
	public String viewEmp() {
		return "index";
		
	}
//	✅ What is Model in Spring MVC?
//    In Spring MVC, Model is an interface used to pass data from the controller to the view (JSP or HTML).
	@RequestMapping("/addEmployee")
	public String saveEmp(
			EmployeeDto employeeDto,
			Model model
			
			) {
		Employee emp=new Employee();
		emp.setName(employeeDto.getName());
		emp.setEmail(employeeDto.getEmail());
		emp.setDepartment(employeeDto.getDepartment());
		empService.saveEmp(emp);
		model.addAttribute("msg","Employee is Added");
		return "index";
		
	}
	@RequestMapping("/viewEmployee")
	public String getAllDetails(Model model) {
		List<Employee> emp=empService.getAllDetails();
		model.addAttribute("employee",emp);
		return "emp_list";
	}
	@RequestMapping("/delEmp")
	public String deleteEmp(@RequestParam long id, Model model) {
		empService.deleteEmp(id);
		List<Employee> emp=empService.getAllDetails();
		model.addAttribute("employee",emp);
		model.addAttribute("del","Successfull Deleted");
		return "emp_list";
		
	}
	@RequestMapping("/getEmpById")
	public String getEmpById(@RequestParam long id, Model model) {
		Employee emp=empService.getEmpById(id);
		model.addAttribute("employee", emp);
		return "updated_list";
	}
	@RequestMapping("/updateEmp")
	public String updateEmp(EmployeeDto empDto,Model model) {
		empService.updateEmp(empDto);
		List<Employee> emp=empService.getAllDetails();
		model.addAttribute("employee",emp);
		model.addAttribute("update","Successfull Updated");
		return "emp_list";
		
	}

}
