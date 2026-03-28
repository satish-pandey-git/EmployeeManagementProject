package com.webdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdemo.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long>{

	

}
