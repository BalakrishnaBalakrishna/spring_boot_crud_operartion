package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class studententity {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
    private int age;
	private String name;
	private String dep;
	private String city;
	 
}