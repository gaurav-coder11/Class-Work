package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	// write a user-define method name like(findBy) and then your fields
	// (fields-name) (fingByName)
	List<Student> findBysName(String sName);
}
