package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
