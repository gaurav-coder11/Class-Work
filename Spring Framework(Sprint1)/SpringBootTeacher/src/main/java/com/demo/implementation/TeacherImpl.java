package com.demo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.TeacherRepo;
import com.demo.entity.Teacher;
import com.demo.exception.TeacherIdNotFoundException;
import com.demo.services.TeacherServices;
@Service
public class TeacherImpl implements TeacherServices {

	@Autowired
	public TeacherRepo trepo;

	// use save() of Jpa repository for saving details
	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return trepo.save(teacher);
	}

	// use findById of Jpa repository for fetching record if not found
	// then throw custom exception
	@Override
	public Teacher getTeacherDetails(int tid) {
		return trepo.findById(tid).orElseThrow(() -> new TeacherIdNotFoundException("Teacher Id is not correct"));

	}

	// use findById of Jpa repository for fetching record if not found
	// then throw custom exception
	// if found update phone,designation & save new records
	@Override
	public Teacher updateTeacherDetails(Teacher teacher, int tid) {
		Teacher updatedTeacher = trepo.findById(tid)
				.orElseThrow(() -> new TeacherIdNotFoundException("Teacher Id is not correct"));
		return updatedTeacher;

	}

	// use findById of Jpa repository for fetching record if not found
	// then throw custom exception
	// if found use deleteById to remove record
	@Override
	public void deleteTeacherDetails(int tid) {
		// TODO Auto-generated method stub
		trepo.findById(tid).orElseThrow(() -> new TeacherIdNotFoundException("Teacher Id is not correct"));
		trepo.deleteById(tid);

	}

	// use findTeacherByPhone of Teacher repository for fetching record
	@Override
	public Teacher getTeacherByPhone(long tphone) {
		// TODO Auto-generated method stub
		return trepo.findTeacherByPhone(tphone);

	}

	// use findTeacherByName of Teacher repository for fetching record
	@Override
	public List<Teacher> getTeacherByName(String tname) {
		// TODO Auto-generated method stub
		return trepo.findTeacherByName(tname);

	}

	@Override
	public List<Teacher> getDesignation(String designation) {
		return trepo.findTeacherByDesignation(designation);

	}

}
