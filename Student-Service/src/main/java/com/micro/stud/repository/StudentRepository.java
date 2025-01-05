package com.micro.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.stud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
