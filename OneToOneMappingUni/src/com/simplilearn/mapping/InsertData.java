package com.simplilearn.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mappingutil.CHibernateUtil;


public class InsertData {


	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			
			SessionFactory sf=CHibernateUtil.getSessionFactory();
			Session session =sf.openSession();
			tx=session.beginTransaction();
			
			Address address=new Address("4th Cross", "Hyderabad", "Andharapradesh");
			Student student=new Student("Ali", "ali@007", "8773676", address);
			
			session.save(student);
			session.save(address);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		
	}
}
