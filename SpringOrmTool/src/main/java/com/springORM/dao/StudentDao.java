package com.springORM.dao;

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

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	
	
}
