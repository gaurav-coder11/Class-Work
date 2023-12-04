package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.services.StudentServices;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	@Autowired
	StudentServices ss;
	
	@PostMapping("/Students/addStudents")
	public ResponseEntity<Student> saveStudenss(@Valid @RequestBody Student studenss){
		return new ResponseEntity<Student>(ss.addStudent(studenss),
				HttpStatus.CREATED);
	}
	
	@GetMapping("/Students/gesstudents/{sid}")
	public ResponseEntity<Student> gesstudenss(@PathVariable("sid") int sid){
		return new ResponseEntity<Student>(ss.getStudentDetails(sid),HttpStatus.OK);
	}
	
	@DeleteMapping("Students/removeStudents/{sid}")
	public ResponseEntity<String> deleteStudenss(@PathVariable("sid") int sid){
		ss.deleteStudentDetails(sid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
	
	@PutMapping("/Students/edisstudents/{sid}")
	public ResponseEntity<Student> edisstudenss(@Valid @PathVariable("sid") int sid, @RequestBody Student students){
		return new ResponseEntity<Student>(ss.updateStudentDetails(students, sid), HttpStatus.OK);
	}

}
