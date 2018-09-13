package com.hcmus.dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcmus.connection.HibernateConnection;
import com.hcmus.model.Student;
import com.opensymphony.xwork2.ModelDriven;

@Repository
public class StudentDAOImpl implements ModelDriven<HibernateConnection>, GenericDAO<Student>
{
    @Autowired(required = true)
    private HibernateConnection hbnConnection;
    
    public Student findByName(String username) {
        Session session;
        try
        {
            session = hbnConnection.getHbnConnection();
            Transaction t = session.beginTransaction();
            
            Query query = session.createQuery("from Student s where s.username = :username");
            query.setParameter("username", username);
            @SuppressWarnings("unchecked")
            List<Student> students = query.list();
            
            t.commit();
            session.close();
            
            return students.get(0);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }  
    }
    
    @Override
    public HibernateConnection getModel()
    {
        return this.hbnConnection;
    }
    
    @Override
    public Student create(Student entity)
    {
        Session session;
        try
        {
            session = hbnConnection.getHbnConnection();
            Transaction t = session.beginTransaction();
            
            int id = (int)session.save(entity);
            
            Query query = session.createQuery("from Student s where s.id = :id");
            query.setParameter("id", id);
            @SuppressWarnings("unchecked")
            List<Student> students = query.list();
            
            t.commit();
            session.close();
            
            return students.get(0);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }            
    }
    
    @Override
    public Student update(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<Student> getList()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Boolean delete(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
