package com.psl.service;

import java.util.List;

import com.psl.bean.Expense;
import com.psl.bean.Reminder;
import com.psl.bean.User;

public interface IManagemeService {
	
	abstract void registerUser(User u);
	abstract boolean authenticateUser(String username, String password);
	
	abstract void addReminder(Reminder r);
	abstract List<Reminder> getReminderByUsername(String username);
	
	abstract void addExpense(Expense e);
	abstract List<Expense> getExpenseByUsername(String username);
}
