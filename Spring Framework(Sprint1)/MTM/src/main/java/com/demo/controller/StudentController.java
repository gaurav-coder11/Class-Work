package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Course;
import com.demo.entity.Student;
import com.demo.repository.CourceRepo;
import com.demo.repository.StudentRepo;

@RestController
@RequestMapping("/api/stud")
public class StudentController {
	@Autowired
	private StudentRepo srepo;
	@Autowired
	private CourceRepo crepo;

	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student stud) {
		return srepo.save(stud);
	}

	@GetMapping("/findAllStudents")
	public List<Student> findAllStudent() {
		return srepo.findAll();
	}

	@GetMapping("/findby/{sid}")
	public Student findStudentById(@PathVariable long sid) {
		return srepo.findById(sid).orElse(null);
	}

	@GetMapping("/find/{sName}")
	public List<Student> findBysName(@PathVariable String name){
			 
		return srepo.findBysName(name);
	}

	@GetMapping("/findBy/{cfees}")
	public List<Course> fingBycfees(double cfees) {
		return crepo.findBycfees(cfees);
	}
}
