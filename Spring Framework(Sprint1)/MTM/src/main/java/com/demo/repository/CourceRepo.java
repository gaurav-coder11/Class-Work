package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Course;

public interface CourceRepo extends JpaRepository<Course, Long> {
	// write a user-define method name like(findBy) and then your fields
	// (fields-name) (fingByName)
	List<Course> findBycfees(double cfees);
}
