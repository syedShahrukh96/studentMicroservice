package com.micro.stud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;

import com.micro.stud.entity.Student;
import com.micro.stud.repository.StudentRepository;
import com.micro.stud.request.StudentRequest;
import com.micro.stud.response.CourseResponse;
import com.micro.stud.response.StudentResponse;

import reactor.core.publisher.Mono;

@Service
public class StudentServiceImp implements StudentService{

	
	Logger logger = LoggerFactory.getLogger(StudentServiceImp.class);
	
	
	@Autowired
	private WebClient webClient;
	
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public StudentResponse createStudent(StudentRequest studentRequest) {	
		
		Student student = new Student();
		student.setFirstName(studentRequest.getFirstName());
		student.setLastName(studentRequest.getLastName());
		student.setEmail(studentRequest.getEmail());
		student.setCourseId(studentRequest.getCourseId());
		
		studentRepository.save(student);
		
		StudentResponse response = new StudentResponse(student);
		response.setCourse(getCourseById(student.getCourseId()));

		return response;
	}


	@Override
	public StudentResponse getById(long id) {
		
		logger.info("In student getById:  "+id);
		
		Student student = studentRepository.findById(id).orElse(new Student());
		
		StudentResponse response = new StudentResponse(student);
		response.setCourse(getCourseById(student.getCourseId()));

		return response;
	}
	
	
	public CourseResponse getCourseById(Long courseId) {

		Mono<CourseResponse> courseResponse = webClient.get().uri("/getById/"+courseId).retrieve()
				.bodyToMono(CourseResponse.class);

		return courseResponse.block();
	}
}


