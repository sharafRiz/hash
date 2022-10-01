package com.simplilearn.astudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class InsertStudent {
	
	public static void main(String args[]) 
	{
		SessionFactory sessionFactory;
		Transaction tx=null;
		
	try {
		
	AnnotationConfiguration aconfig=new AnnotationConfiguration();
	aconfig=(AnnotationConfiguration)aconfig.configure();
	
	sessionFactory =aconfig.buildSessionFactory();
	Session session=sessionFactory.openSession();
	tx=session.beginTransaction();
	
	
	 Student stu=new Student("WiliamKaala","wiliam@kala.com",102547,"Delhi",1500);
	 session.save(stu);
	 tx.commit();
	session.close();
	
	} catch(Exception e ) {
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
	}
	}
}
