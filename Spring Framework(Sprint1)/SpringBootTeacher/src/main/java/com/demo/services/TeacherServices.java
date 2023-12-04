package com.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Teacher;
@Service
public interface TeacherServices {
	//method for saving teacher in db
	Teacher addTeacher(Teacher teacher);
	//method to fetch 
	Teacher getTeacherDetails(int tid);

	Teacher updateTeacherDetails(Teacher teacher, int tid);

	void deleteTeacherDetails(int tid);

	Teacher getTeacherByPhone(long tphone);

	List<Teacher> getTeacherByName(String tname);

	List<Teacher> getDesignation(String designation);
}
