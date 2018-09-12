package com.hcmus.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateConnection
{
    AnnotationConfiguration cfg = new AnnotationConfiguration();
    SessionFactory factory;
    Session session;
    
    public Session getHbnConnection() {
        cfg.configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
        
        session = factory.openSession();
        
        return session;
    }
}
