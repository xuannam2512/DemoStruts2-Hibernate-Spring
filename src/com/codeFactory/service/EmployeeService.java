package com.codeFactory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codeFactory.bean.Employee;
import com.codeFactory.dao.EmployeeDAO;

@Service
public class EmployeeService {
	private EmployeeDAO empDao;
	
	public EmployeeService() {
	}
	
	public EmployeeService(EmployeeDAO empDao) {
		this.empDao = empDao;
	}
	
	public List<Employee> listEmployee() {
		return empDao.getList();
	}
	
	public boolean addEmployee(Employee emp) {
		if(empDao.addEmployee(emp) == true) {
			return true;
		}
		
		return false;
	}
}
