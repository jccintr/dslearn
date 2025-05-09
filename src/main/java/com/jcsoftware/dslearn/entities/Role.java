package com.jcsoftware.dslearn.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String authority;

}
