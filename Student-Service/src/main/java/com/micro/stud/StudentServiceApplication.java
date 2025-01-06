package com.micro.stud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class StudentServiceApplication {

//	@Value("${course.service.url}")
//	private String courseServiceUrl;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
	
//	@Bean
//	public WebClient webClient() {
//		WebClient webClient = WebClient.builder()
//				.baseUrl(courseServiceUrl)
//				.build();
//		return webClient;
//	}

}
