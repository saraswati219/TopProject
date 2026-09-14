package com.app.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.config.HibernateUtilCRUDOperation;
import com.app.model.Employee;

public class Test {
	Session session =HibernateUtilCRUDOperation.getSessionFactory().openSession();
	
	public void create()
	{
		Employee e = new Employee();
		
		e.setName("Saraswati");
		e.setSalary(100000);
		
	
		Transaction tx = session.beginTransaction();
		
		session.persist(e);
		
		
		tx.commit();  //permently data  store when transaction commit use
		
	}
	
	public void getData()
	{
		Employee e = session.get(Employee.class, 1);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
	public void UpdateData()
	{
		Employee e = new Employee();
		e.setId(1);
		e.setName("Saraswati");
		e.setSalary(200000);
		session.update(e);
		session.beginTransaction().commit();
	}
	
	public void Delete()
	{
		Employee e = new Employee();
		e.setId(2);
		session.delete(e);
		session.beginTransaction().commit();
	}
	public static void main(String[] args) {
		Test test = new Test();
		//test.create();
		//test.getData();
		//test.UpdateData();
		test.Delete();
		
	}
	
	

}
