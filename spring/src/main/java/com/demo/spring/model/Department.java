package com.demo.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Entity
public class Department {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String departmentname;
    
    @OneToOne(mappedBy = "depart")
    private Employee employee;
   
}
