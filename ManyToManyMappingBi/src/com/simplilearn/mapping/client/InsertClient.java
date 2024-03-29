package com.simplilearn.mapping.client;

import java.util.*;

import org.hibernate.*;

import com.simplilearn.mapping.Account;
import com.simplilearn.mapping.Customer;
import com.simplilearn.mapping.utill.CHibernateUtil;


public class InsertClient {
public static void main(String[] args) {
	
	Transaction tx=null;
	
	try {
		
		SessionFactory sf=CHibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		
		Customer cust1= new Customer("om", " om@abc", new Date(), new Long(9999));
		session.save(cust1);
		
		Customer cust2=new Customer("Ali", "ali@007", new Date(), new Long(9999));
		session.save(cust2);
		
		Account a1=new Account("SA", 5000.00);
		session.save(a1);
		
		Account a2=new Account("SA", 6000.00);
		session.save(a2);
		
		Account a3=new Account("SA", 7000.00);
		session.save(a3);
		
		Set<Account> accs= new HashSet<Account>();
		accs.add(a1);
		accs.add(a2);
		accs.add(a3);
		cust1.setAccounts(accs);
		
		Set<Account> accs1= new HashSet<Account>();
		accs.add(a2);
		accs.add(a3);
		cust2.setAccounts(accs1);
		
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
