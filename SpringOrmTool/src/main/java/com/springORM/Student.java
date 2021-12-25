package com.springORM;

import javax.persistence.*;

@Entity
public class Student {
	
	@Id
	private int studentId;
	private String name;
	private String city;
	private String branch;
	
	
	public Student() {
		super();
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", city=" + city + ", branch=" + branch + "]";
	}

	
	
}
