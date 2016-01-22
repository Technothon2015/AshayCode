package com.psl.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.psl.bean.CheckItem;
import com.psl.bean.CheckList;
import com.psl.bean.Expense;
import com.psl.bean.Reminder;
import com.psl.bean.User;

public class ManagemeDaoImplementation implements IManagemeDao {


	@Override
	public void registerUser(User u) {
	
		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		session.save(u);
		transaction.commit();
		session.close();
		factory.close();
		
	}

	@Override
	public List<User> getAllUser() {
  

		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Query queryResult = session.createQuery("from User");
		List<User> allUsers=new ArrayList<User>();
		allUsers = queryResult.list();
		
		 System.out.println("Database contents delivered...");
		 session.close();
		 factory.close();
		 
		 return allUsers;
		
	}

	@Override
	public void addReminder(Reminder r) {

		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		session.save(r);
		transaction.commit();
		System.out.println("Added to db");
		session.close();
		factory.close();
	}

	@Override
	public List<Reminder> getAllReminder() {

		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Query queryResult = session.createQuery("from Reminder");
		List<Reminder> allReminder=new ArrayList<Reminder>();
		allReminder = queryResult.list();
		
		 System.out.println("Database contents delivered...");
		 session.close();
		 factory.close();
		 
		 return allReminder;
	}

	@Override
	public void addExpense(Expense e) {

		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		session.save(e);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public List<Expense> getAllExpense() {

		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Query queryResult = session.createQuery("from Expense");
		List<Expense> allExpense=new ArrayList<Expense>();
		allExpense = queryResult.list();
		
		 System.out.println("Database contents delivered...");
		 session.close();
		 factory.close();
		 
		 return allExpense;
	}

	@Override
	public void addCheckItem(CheckItem checkItem) {
		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		session.save(checkItem);
		transaction.commit();
		session.close();
		factory.close();
		
	}

	@Override
	public void addCheckList(CheckList checkList) {
		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		session.save(checkList);
		transaction.commit();
		session.close();
		factory.close();
		
	}

	@Override
	public List<CheckList> getAllCheckList() {
		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Query queryResult = session.createQuery("from CheckList");
		List<CheckList> allCheckList=new ArrayList<CheckList>();
		allCheckList = queryResult.list();
		
		 System.out.println("Database contents delivered...");
		 session.close();
		 factory.close();
		 
		 return allCheckList;
	}

	@Override
	public List<CheckItem> getAllCheckItem() {
		Configuration configuration=new Configuration();
		configuration.addResource("com/psl/bean/bean.hbm.xml");
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Query queryResult = session.createQuery("from CheckItem");
		List<CheckItem> allCheckItem=new ArrayList<CheckItem>();
		allCheckItem = queryResult.list();
		
		 System.out.println("Database contents delivered...");
		 session.close();
		 factory.close();
		 
		 return allCheckItem;
	}


}
