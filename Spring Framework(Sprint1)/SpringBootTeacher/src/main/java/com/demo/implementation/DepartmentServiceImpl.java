package com.demo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.DepartmentRepo;
import com.demo.entity.Department;
import com.demo.exception.DeptartmentIdNotFoundException;
import com.demo.services.DepartmentServices;
@Service
public class DepartmentServiceImpl implements DepartmentServices{
	@Autowired
	DepartmentRepo drepo;

	@Override
	public Department getDeptDetail(int did) {
		// TODO Auto-generated method stub
		return drepo.findById(did).
				orElseThrow(()-> new DeptartmentIdNotFoundException("Incorrect Department id"));

	}

	@Override
	public List<Department> getAllDept() {
		// TODO Auto-generated method stub
		return drepo.findAll();

	}

	@Override
	public Department updateDeptDetail(Department department, int did) {
		// TODO Auto-generated method stub
		Department newDept = drepo.findById(did).
				orElseThrow(()-> new DeptartmentIdNotFoundException("Incorrect Department id"));
		
		newDept.setNoOfEmp(department.getNoOfEmp());
		newDept.setDeptHOD(department.getDeptHOD());
			
			drepo.save(newDept);
			return newDept;

	}

}
