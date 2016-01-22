package com.psl.bean;

import java.util.Date;

public class Expense {

	int expenseId;
	String username;
	double expenseAmount;
	ExpenseType expenseType;
	String expenseDescription;
	Date expenseDate;
	
	public Expense(int expenseId, String username, double expenseAmount,
			ExpenseType expenseType, String expenseDescription, Date expenseDate) {
		super();
		this.expenseId = expenseId;
		this.username = username;
		this.expenseAmount = expenseAmount;
		this.expenseType = expenseType;
		this.expenseDescription = expenseDescription;
		this.expenseDate = expenseDate;
	} 
	
	public Expense() {
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}

	public String getExpenseDescription() {
		return expenseDescription;
	}

	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", username=" + username
				+ ", expenseAmount=" + expenseAmount + ", expenseType="
				+ expenseType + ", expenseDescription=" + expenseDescription
				+ ", expenseDate=" + expenseDate + "]";
	}

	
	
	
	
}
