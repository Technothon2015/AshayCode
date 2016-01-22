package com.psl.bean;

public class User {
	
	String username;
	
	String password;
	
	String firstName;
	
	String lastName;
	
	String homeAddress;
	
	String officeAddress;
	
	String profilePicture;
	
	String email;
	
	String mobileNo;
	
	public User(String username, String password, String firstName,
			String lastName, String homeAddress, String officeAddress,
			String profilePicture, String email, String mobileNo) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.profilePicture = profilePicture;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public User() {
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", homeAddress=" + homeAddress + ", officeAddress="
				+ officeAddress + ", profilePicture=" + profilePicture + "]";
	}
	
	
	
	

}
