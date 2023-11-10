package com.springcore.springjdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {

	
	private int id;
//	@Value("#{new String('rohan').toUpperCase()}")
	private String personName;
	private int personAge;
	private String personBloodGroup;
	private String personHeight;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String personName, int personAge, String personBloodGroup, String personHeight) {
		super();
		this.id = id;
		this.personName = personName;
		this.personAge = personAge;
		this.personBloodGroup = personBloodGroup;
		this.personHeight = personHeight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonBloodGroup() {
		return personBloodGroup;
	}
	public void setPersonBloodGroup(String personBloodGroup) {
		this.personBloodGroup = personBloodGroup;
	}
	public String getPersonHeight() {
		return personHeight;
	}
	public void setPersonHeight(String personHeight) {
		this.personHeight = personHeight;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", personName=" + personName + ", personAge=" + personAge + ", personBloodGroup="
				+ personBloodGroup + ", personHeight=" + personHeight + "]";
	}
	
	
	
	
	
}
