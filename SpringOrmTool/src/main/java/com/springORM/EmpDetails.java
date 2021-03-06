package com.springORM;
import javax.persistence.*;


@Entity
public class EmpDetails {
	
	@Id
	private int empId;
	private String empName;
	private String empDept;
	private double  empSal;
	
	
	public EmpDetails() {
		super();
	}

	public EmpDetails(int empId, String empName, String empDept, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empSal;
	}





	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpDept() {
		return empDept;
	}


	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "EmpDetails [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal
				+ "]";
	}

	
	
	
}
