package com.demo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.CourceRepo;
import com.demo.entity.Cource;
import com.demo.exception.CourseNotFoundException;
import com.demo.services.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourceRepo crepo;

	@Override
	public Cource getCourseDetail(int cid) {
		// TODO Auto-generated method stub
		return crepo.findById(cid).orElseThrow(()-> new CourseNotFoundException("Incorrect Course Entered"));

	}

	@Override
	public List<Cource> getAllCourses() {
		// TODO Auto-generated method stub
		return crepo.findAll();

	}

}
