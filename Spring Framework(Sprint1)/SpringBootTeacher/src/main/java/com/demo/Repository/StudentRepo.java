package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
