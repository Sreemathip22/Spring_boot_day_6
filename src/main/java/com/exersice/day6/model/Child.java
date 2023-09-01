package com.exersice.day6.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Child {
@Autowired
@Id

private int babyId;
private String babyFirstName;
private String babyLastName;
private String fatherName;
private String motherName;

public int getBabyId() {
	return babyId;
}
public void setBabyId(int babyId) {
	this.babyId = babyId;
}
public String getBabyFirstName() {
	return babyFirstName;
}
public void setBabyFirstName(String babyFirstName) {
	this.babyFirstName = babyFirstName;
}
public String getBabyLastName() {
	return babyLastName;
}
public void setBabyLastName(String babyLastName) {
	this.babyLastName = babyLastName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public Child(int babyId, String babyFirstName, String babyLastName, String fatherName, String motherName) {
	super();
	this.babyId = babyId;
	this.babyFirstName = babyFirstName;
	this.babyLastName = babyLastName;
	this.fatherName = fatherName;
	this.motherName = motherName;
}
public Child() {
	super();
	
}

}
