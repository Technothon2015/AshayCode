package com.psl.bean;

public class CheckItem {

	int checkItemId;
	String description;
	CheckStatus itemStatus;
	
	public CheckItem() {
		// TODO Auto-generated constructor stub
	}

	public CheckItem(String description, CheckStatus itemStatus) {
		super();
		this.checkItemId = checkItemId;
		this.description = description;
		this.itemStatus = itemStatus;
	}

	public int getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(int checkItemId) {
		this.checkItemId = checkItemId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CheckStatus getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(CheckStatus itemStatus) {
		this.itemStatus = itemStatus;
	}

	
}
