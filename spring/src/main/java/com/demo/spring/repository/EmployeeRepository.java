package com.demo.spring.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.spring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	   @Query(value = "select employee.lastname from Employee employee where employee.id = ?i and employee.isactive = ?j",nativeQuery = true)
	   @Transactional
		List<Employee> findEmployeById(@Param("i") int i, @Param("j") int j);
}
