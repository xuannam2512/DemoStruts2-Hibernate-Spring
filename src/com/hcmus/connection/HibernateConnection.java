package com.hcmus.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateConnection
{
    static AnnotationConfiguration cfg = new AnnotationConfiguration();
    static SessionFactory factory;
    Session session;
    
    static {
        cfg.configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }
    
    public Session getHbnConnection() {        
        session = factory.openSession();
        
        return session;
    }
}
