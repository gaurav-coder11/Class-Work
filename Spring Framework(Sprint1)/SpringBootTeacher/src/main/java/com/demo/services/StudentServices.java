package com.demo.services;

import org.springframework.stereotype.Service;

import com.demo.entity.Student;
@Service
public interface StudentServices {

	// method for saving Students details in db table
	Student addStudent(Student student);

	// method to fetch Students detail based on sid from db table
	Student getStudentDetails(int sid);

	// method to modify Students detail based on sid from db table
	Student updateStudentDetails(Student student, int sid);

	// method to remove Students detail based on sid from db table
	void deleteStudentDetails(int sid);
}
