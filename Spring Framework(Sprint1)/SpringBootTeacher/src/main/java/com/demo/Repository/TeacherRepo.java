package com.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
	
	@Query("select t from Teacher t where t.tphone=?1")
	Teacher findTeacherByPhone(long tphone);

	@Query("select t from Teacher t where t.tname=?1")
	List<Teacher> findTeacherByName(String tname);

	@Query("select t from Teacher t where t.designation like ?1% orderby tname")
	List<Teacher> findTeacherByDesignation(String designation);
}
