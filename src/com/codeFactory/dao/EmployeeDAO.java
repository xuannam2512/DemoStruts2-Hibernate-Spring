package com.codeFactory.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.codeFactory.bean.Employee;
import com.codeFactory.connection.HibernateConnection;

@Repository
public class EmployeeDAO {
	private HibernateConnection hbnConnection;
	
	public EmployeeDAO(HibernateConnection hbnConnection) {
		this.hbnConnection = hbnConnection;
	}
	
	public List<Employee> getList() {
		Session session;
		Transaction t;
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		try {
			session = hbnConnection.getHbmConnection();
			t = session.beginTransaction();
			
			listEmployee = session.createQuery("from Employee").list();
			
			t.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return listEmployee;
	}
	
	public boolean addEmployee(Employee emp) {
		Session session;
		Transaction t;
		
		try {
			session = hbnConnection.getHbmConnection();
			t = session.beginTransaction();
			
			session.save(emp);
			
			t.commit();
			session.close();					
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
		return true;
	}
}
