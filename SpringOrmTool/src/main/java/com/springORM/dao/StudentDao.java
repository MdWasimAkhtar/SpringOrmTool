package com.springORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springORM.Student;

public class StudentDao {

	private HibernateTemplate hibernatetemplate;	
	
	@Transactional
	public int insert(Student student) {
     Integer res = 	(Integer)this.hibernatetemplate.save(student);
		return res;
	}
	
	//get
	public Student getstudent(int studentId) {
       Student update =(Student) this.hibernatetemplate.get(Student.class, studentId);
       
       return update;
	}
	
	//get Multiple 
	public List<Student> getAllStudent() {
     List<Student>	st =	this.hibernatetemplate.loadAll(Student.class);
		return st;
	}
	
	//update
	@Transactional
	public void updateStudent(Student stud) {
		  this.hibernatetemplate.update(stud);
	}
	
	//delete
	public void deleteStudent(int studentId) {
        Student st =(Student)		this.hibernatetemplate.get(Student.class, studentId);
        this.hibernatetemplate.delete(st);
	}
	
	

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	
	
}
