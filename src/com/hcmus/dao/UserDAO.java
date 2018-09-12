package com.hcmus.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcmus.connection.HibernateConnection;
import com.hcmus.model.User;

@Repository
public class UserDAO
{
    private HibernateConnection hbnConnection = new HibernateConnection();
    
    public Boolean createUser(User user)
    {
        try
        {
            Session session = hbnConnection.getHbnConnection();
            Transaction t = session.beginTransaction();
            
            session.save(user);
            
            t.commit();
            session.close();
            
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
}
