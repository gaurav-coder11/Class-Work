package com.demo.controller;

import java.util.List;

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

import com.demo.entity.Teacher;
import com.demo.services.TeacherServices;

import jakarta.validation.Valid;

@RestController
public class TeacherController {
	@Autowired
	TeacherServices ts;

//use postmapping to insert data 
	@PostMapping("/Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(ts.addTeacher(teacher), HttpStatus.CREATED);

	}

//use getmapping to fetch data from db table
	@GetMapping("/Teacher/getTeacher/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid) {
		return new ResponseEntity<Teacher>(ts.getTeacherDetails(tid), HttpStatus.OK);
	}

	// use putmapping to edit existing data
	@PutMapping("/Teacher/editTeacher/{tid}")
	public ResponseEntity<Teacher> editTeacher(@Valid @PathVariable("tid") int tid, @RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(ts.updateTeacherDetails(teacher, tid), HttpStatus.OK);
	}

	// use deletemapping to remove existing data
	@DeleteMapping("Teacher/removeTeacher/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid) {
		ts.deleteTeacherDetails(tid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}

//		@GetMapping("Teacher/getTName/{tname}")
	public List<Teacher> getTeacherName(@PathVariable("tname") String tname) {
		return ts.getTeacherByName(tname);
	}

	@GetMapping("Teacher/getTPhone/{tphone}")
	public ResponseEntity<Teacher> getTeacherPhone(@PathVariable("tphone") long tphone) {
		return new ResponseEntity<Teacher>(ts.getTeacherByPhone(tphone), HttpStatus.OK);
	}

	@GetMapping("Teacher/getTDesignation/{designation}")
	public List<Teacher> getTeacherDesignation(@PathVariable("designation") String designation) {
		return ts.getDesignation(designation);
	}

}
