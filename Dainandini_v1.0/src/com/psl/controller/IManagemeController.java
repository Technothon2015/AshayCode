package com.psl.controller;

import org.springframework.ui.Model;

import com.psl.bean.CheckList;
import com.psl.bean.Expense;
import com.psl.bean.Reminder;
import com.psl.bean.User;

public interface IManagemeController {

	abstract String registerUser(User u);
	abstract String authenticateUser(String username,String password);
	
	
	abstract String getReminderByUsername(String username,Model model);
	
	
	abstract String getExpenseByUsername(String username,Model model);
	
	
	abstract String getCheckListByUsername(String username,Model model);
	abstract String getCheckItemByCheckList(String username, Integer checkListId,Model model);
	abstract String addReminder(String username, Reminder reminder);
	abstract String addExpense(String username, Expense expense);
	abstract String addCheckList(String username, CheckList checkList);
	abstract String getAll(String username, Model model);
	
	
}
