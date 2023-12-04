package com.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Cource;


@Service
public interface CourseService {

	Cource getCourseDetail(int cid);

	List<Cource> getAllCourses();
}
