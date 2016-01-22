package com.psl.bean;

import java.util.Date;
import java.util.List;

public class CheckList {

	int checkListId;
	String username;
	List<CheckItem> itemlist; 
	Date checkListDate;
	
	public int getCheckListId() {
		return checkListId;
	}

	public void setCheckListId(int checkListId) {
		this.checkListId = checkListId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<CheckItem> getItemlist() {
		return itemlist;
	}

	public void setItemlist(List<CheckItem> itemlist) {
		this.itemlist = itemlist;
	}

	public Date getCheckListDate() {
		return checkListDate;
	}

	public void setCheckListDate(Date checkListDate) {
		this.checkListDate = checkListDate;
	}

	public CheckList() {
		// TODO Auto-generated constructor stub
	}

	public CheckList(String username,
			List<CheckItem> itemlist, Date checkListDate) {
		super();
		this.checkListId = checkListId;
		this.username = username;
		this.itemlist = itemlist;
		this.checkListDate = checkListDate;
	}

	
		
	
}
