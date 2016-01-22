package com.psl.service;

import java.util.ArrayList;
import java.util.List;

import com.psl.bean.CheckItem;
import com.psl.bean.CheckList;
import com.psl.bean.Expense;
import com.psl.bean.Reminder;
import com.psl.bean.User;
import com.psl.dao.IManagemeDao;
import com.psl.dao.ManagemeDaoImplementation;

public class ManagemeServiceImplementation implements IManagemeService {

	private IManagemeDao dao;
	
	public IManagemeDao getDao() {
		return dao;
	}

	public void setDao(IManagemeDao dao) {
		this.dao = dao;
	}
	

	@Override
	public void registerUser(User u) {
		dao=new ManagemeDaoImplementation();
		dao.registerUser(u);
	}

	

	@Override
	public boolean authenticateUser(String username, String password) {
		dao=new ManagemeDaoImplementation();
		List<User> allUsers=dao.getAllUser();
		
		for (int i = 0; i < allUsers.size(); i++) {
			   User user = (User) allUsers.get(i);
			   if(user.getUsername().equals(username)&&user.getPassword().equals(password))
			   {
				   System.out.println("User Authenticated!!");
				   return true;
			   }
			   else{
				   System.out.println("Username/Password mismatch");
				   return false;
			   }
			 }
		System.out.println("In Service");
		return false;
	}

	@Override
	public void addReminder(Reminder r) {

		dao=new ManagemeDaoImplementation();
		dao.addReminder(r);
	}

	@Override
	public List<Reminder> getReminderByUsername(String username) {
		dao=new ManagemeDaoImplementation();
		List<Reminder> allReminder=dao.getAllReminder();
		List<Reminder> reminderByUsername=new ArrayList<Reminder>();
		for (int i = 0; i < allReminder.size(); i++) {
			   Reminder reminder = (Reminder) allReminder.get(i);
			   if(username.equals(reminder.getUsername()))
			   {
				   reminderByUsername.add(reminder);
			   }
			 }
		return reminderByUsername;
	}

	@Override
	public void addExpense(Expense e) {

		dao=new ManagemeDaoImplementation();
		dao.addExpense(e);
	}

	@Override
	public List<Expense> getExpenseByUsername(String username) {
		dao=new ManagemeDaoImplementation();
		List<Expense> allExpense=dao.getAllExpense();
		List<Expense> expenseByUsername=new ArrayList<Expense>();
		for (int i = 0; i < allExpense.size(); i++) {
			Expense expense = (Expense) allExpense.get(i);
			   if(username.equals(expense.getUsername()))
			   {
				   expenseByUsername.add(expense);
			   }
			 }
		return expenseByUsername;
	}

	public void addCheckList(CheckList checkList) {
		
		dao=new ManagemeDaoImplementation();
		dao.addCheckList(checkList);
	}

	public List<CheckList> getCheckListByUsername(String username) {
		System.out.println("service in");
		dao=new ManagemeDaoImplementation();
		List<CheckList> allcheckList=dao.getAllCheckList();
		List<CheckList> checkListByUsername=new ArrayList<CheckList>();
		for (int i = 0; i < allcheckList.size(); i++) {
			CheckList checkList = (CheckList) allcheckList.get(i);
			   if(username.equals(checkList.getUsername()))
			   {
				   checkListByUsername.add(checkList);
			   }
			 }
		return checkListByUsername;
	}

	public List<CheckItem> getCheckItemByList(String string, int checkListId) {
		System.out.println("service in");
		dao=new ManagemeDaoImplementation();
		List<CheckList> allcheckList=dao.getAllCheckList();
		for (int i = 0; i < allcheckList.size(); i++) {
			CheckList checkList = (CheckList) allcheckList.get(i);
			   if(checkListId == checkList.getCheckListId())
			   {
				   return checkList.getItemlist();
			   }
			 }
		return new ArrayList<CheckItem>();	
		}

}
