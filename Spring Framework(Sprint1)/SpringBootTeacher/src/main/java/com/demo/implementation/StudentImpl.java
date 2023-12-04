package com.demo.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.StudentRepo;
import com.demo.entity.Student;
import com.demo.exception.StudentIdNotException;
import com.demo.services.StudentServices;
@Service
public class StudentImpl implements StudentServices{
@Autowired
StudentRepo srepo;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return srepo.save(student);

	}

	@Override
	public Student getStudentDetails(int sid) {
		// TODO Auto-generated method stub
		return srepo.findById(sid).
				orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));

	}

	@Override
	public Student updateStudentDetails(Student student, int sid) {
		// TODO Auto-generated method stub
		Student updatedstudent = srepo.findById(sid).
				orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));
		//set new values
				updatedstudent.setSedu(student.getSedu());
				srepo.save(updatedstudent);
				return updatedstudent;


	}

	@Override
	public void deleteStudentDetails(int sid) {
		// TODO Auto-generated method stub
		srepo.findById(sid).
		orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));
		srepo.deleteById(sid);

		
	}

}
