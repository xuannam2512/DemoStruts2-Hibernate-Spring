package com.codeFactory.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codeFactory.bean.Employee;
import com.codeFactory.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StoreData extends ActionSupport implements ModelDriven<Employee>{

	private Employee emp = new Employee();
	private List<Employee> listEmployee = new ArrayList<Employee>();
	private EmployeeService empService = new EmployeeService();
	
	public EmployeeService getEmpService() {
		return empService;
	}

	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	}

	public String execute()
	{
		if(empService.addEmployee(emp) == true) 
			return SUCCESS;
		
		return ERROR;
	}
	
	public String getEmployees() {
		listEmployee = empService.listEmployee();
		
		if(listEmployee.size() > 0) 
			return SUCCESS;
		
		return ERROR;
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}
