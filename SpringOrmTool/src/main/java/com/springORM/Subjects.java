package com.springORM;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Subjects {
	
	private String name;
	
	@Column(name="Math")
	private int mathMarks;
	
	@Column(name="Physic")
	private int physicsMarks;
	
	@Column(name="Chemistry")
	private int chemistryMarks;
	

	private int totalMarks;
	
	@OneToOne
	private Student student;
	
	public Subjects() {
		super();
	}

	
	
	public Subjects(String name, int mathMarks, int physicsMarks, int chemistryMarks, int totalMarks, Student student) {
		super();
		this.name = name;
		this.mathMarks = mathMarks;
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.totalMarks = totalMarks;
		this.student = student;
	}



	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Subjects [mathMarks=" + mathMarks + ", physicsMarks=" + physicsMarks + ", chemistryMarks="
				+ chemistryMarks + ", totalMarks=" + totalMarks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
