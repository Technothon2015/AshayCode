package com.psl.dao;

import java.util.List;

import com.psl.bean.CheckItem;
import com.psl.bean.CheckList;
import com.psl.bean.Expense;
import com.psl.bean.Reminder;
import com.psl.bean.User;

public interface IManagemeDao {

	abstract void registerUser(User u);
	abstract List<User> getAllUser();
	abstract void addReminder(Reminder r);
	abstract List<Reminder> getAllReminder();
	abstract void addExpense(Expense e);
	abstract List<Expense> getAllExpense();
	abstract void addCheckItem(CheckItem checkItem);
	abstract void addCheckList(CheckList checkList);
	abstract List<CheckList> getAllCheckList();
	abstract List<CheckItem> getAllCheckItem();
}
