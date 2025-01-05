package com.micro.stud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.micro.stud.request.StudentRequest;
import com.micro.stud.response.StudentResponse;
import com.micro.stud.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public StudentResponse createStudent(@RequestBody StudentRequest studentRequest) {
		return studentService.createStudent(studentRequest);
		
	}
	
	@GetMapping("/getById/{id}")
	public StudentResponse getById(@PathVariable long id) {
		return studentService.getById(id);
	}

}