package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Cource;
import com.demo.services.CourseService;

@RestController
public class CourceController {
	@Autowired
	CourseService cs;
	
	@GetMapping("/Courses/getcourses")
	public List<Cource> getCourses(){
		return cs.getAllCourses();
	}
	
	@GetMapping("/Courses/getcourses/{cid}")
	public ResponseEntity<Cource> getCourses(@PathVariable("cid") int cid){
		return new ResponseEntity<Cource>(cs.getCourseDetail(cid),HttpStatus.OK);
	}

}
