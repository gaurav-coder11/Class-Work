package com.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Department;
@Service
public interface DepartmentServices {
	
	Department getDeptDetail(int did);

	List<Department> getAllDept();

	Department updateDeptDetail(Department department,int did);

}
