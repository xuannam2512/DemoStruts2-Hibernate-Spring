package com.hcmus.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcmus.connection.HibernateConnection;
import com.hcmus.model.Subjects;
import com.opensymphony.xwork2.ModelDriven;

@Repository
public class SubjectDAOImpl implements GenericDAO<Subjects>, ModelDriven<HibernateConnection>
{
    @Autowired
    HibernateConnection hbnConnection;
    
    @Override
    public Subjects create(Subjects entity)
    {
        return null;
    }

    @Override
    public Subjects update(int id)
    {
        return null;
    }

    @Override
    public List<Subjects> getList()
    {
        try
        {
            Session session = hbnConnection.getHbnConnection();
            Transaction t = session.beginTransaction();
            
            Query query = session.createQuery("from Subjects");
            
            @SuppressWarnings("unchecked")
            List<Subjects> subjects = query.list();
            
            t.commit();
            session.close();
            
            return subjects;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public Boolean delete(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HibernateConnection getModel()
    {
        // TODO Auto-generated method stub
        return this.hbnConnection;
    }
    
    
    public HibernateConnection getHbnConnection()
    {
        return hbnConnection;
    }

    public void setHbnConnection(HibernateConnection hbnConnection)
    {
        this.hbnConnection = hbnConnection;
    }
    
}
