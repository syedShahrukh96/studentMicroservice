package com.micro.stud.service;


import com.micro.stud.request.StudentRequest;
import com.micro.stud.response.CourseResponse;
import com.micro.stud.response.StudentResponse;

public interface StudentService {

	StudentResponse createStudent(StudentRequest studentRequest);

	StudentResponse getById(long id);
	
	CourseResponse getCourseById(Long courseId);

}
