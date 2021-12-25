package com.springORM;

import javax.persistence.*;

public class Student {
	
	@Id
	private String usn;
	
	@OneToOne
	private Subjects subj;
	
	public Student() {
		super();
	}

	public Student(String usn, Subjects subj) {
		super();
		this.usn = usn;
		this.subj = subj;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public Subjects getSubj() {
		return subj;
	}

	public void setSubj(Subjects subj) {
		this.subj = subj;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", subj=" + subj + "]";
	}

	
	

}
