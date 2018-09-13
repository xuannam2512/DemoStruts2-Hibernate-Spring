package com.hcmus.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcmus.connection.HibernateConnection;
import com.hcmus.model.User;
import com.opensymphony.xwork2.ModelDriven;

@Repository
public class UserDAOImpl implements ModelDriven<HibernateConnection>, GenericDAO<User>
{
    @Autowired(required = true)
    private HibernateConnection hbnConnection;
    
    @Override
    public HibernateConnection getModel()
    {
        return this.hbnConnection;
    }
    
    @Override
    public User create(User entity)
    {
        try
        {
            Session session = hbnConnection.getHbnConnection();
            Transaction t = session.beginTransaction();
            
            User user = (User)session.save(entity);            
            
            t.commit();
            session.close();
            
            return user;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
    public User update(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<User> getList()
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
