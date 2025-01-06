package com.micro.stud.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.micro.stud.response.CourseResponse;


//@FeignClient(
//		url = "${course.service.url}",
//		path = "/api/course",
//		value = "courseFeignClient"
//		)

@FeignClient(
		name="Micro-Project",
		path = "/api/course"
		)
public interface CourseFeignClient {
	
	@GetMapping("/getById/{id}")
	public CourseResponse getById(@PathVariable long id);
}
