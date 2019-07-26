package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int userId;
private String userName;
private int userAge;
private String occupation;
private String userAddress;


public User(int userId, String userName, int userAge, String occupation, String userAddress) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userAge = userAge;
	this.occupation = occupation;
	this.userAddress = userAddress;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserAge() {
	return userAge;
}
public void setUserAge(int userAge) {
	this.userAge = userAge;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", occupation=" + occupation
			+ ", userAddress=" + userAddress + "]";
}

	
}
