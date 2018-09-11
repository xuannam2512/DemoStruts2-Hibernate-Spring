package com.codeFactory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateConnection {

	AnnotationConfiguration cfg = new AnnotationConfiguration();
	SessionFactory factory;
	Session session1;
	
	public Session getHbmConnection()
	{
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session1 = factory.openSession();
		
		return session1;
	}
}
