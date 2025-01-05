package com.micro.stud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long StudentId;
		private String firstName;
		private String lastName;
		private String email;
		
		private Long courseId;
		
	
	
}
