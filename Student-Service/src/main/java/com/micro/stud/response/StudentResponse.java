package com.micro.stud.response;

import com.micro.stud.entity.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {

	
		private Long StudentId;
		private String firstName;
		private String lastName;
		private String email;
		
		private CourseResponse course;
		
		public StudentResponse(Student student) {
			super();
			this.StudentId = student.getStudentId();
			this.firstName = student.getFirstName();
			this.lastName = student.getLastName();
			this.email = student.getEmail();
		}
		
	
		
		
		
	
}
