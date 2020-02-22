package com.demo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.model.Department;

public interface DepartRepository extends JpaRepository<Department, Integer>{

	
}
