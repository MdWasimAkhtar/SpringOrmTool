package com.springORM.dao;



import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springORM.EmpDetails;

public class EmpDao {
	
	
//	private JdbcTemplate jdbctemplate; not XX
	
	private HibernateTemplate hibernatetempale;
	
	@Transactional
	public int insert(EmpDetails  emps){
		
		Integer updateCount = (Integer)this.hibernatetempale.save(emps);
		return updateCount;
	}
	
	//get Single data
	public EmpDetails getEmp(EmpDetails emps) {
		
		EmpDetails e1 =  this.hibernatetempale.get(EmpDetails.class , emps.getEmpId());
		return e1;
	}
	
	//get Multiple data
	public List<EmpDetails>  getAllEmp(EmpDetails emp){
		
	   List<EmpDetails>  listEmp =	this.hibernatetempale.loadAll(EmpDetails.class);
	    
	   return listEmp;
	}
	
	//deleting
	
	public void  delete(int eid) {
		
       EmpDetails getEmps = this.hibernatetempale.get(EmpDetails.class, eid);
       
       this.hibernatetempale.delete(getEmps);
	}
	
	//updating
	
	@Transactional
	public void update(EmpDetails emps) {
		
	//	EmpDetails emp = this.hibernatetempale.get(EmpDetails.class, eid);
	     this.hibernatetempale.update(emps);
		
	}

	public HibernateTemplate getHibernatetempale() {
		return hibernatetempale;
	}

	public void setHibernatetempale(HibernateTemplate hibernatetempale) {
		this.hibernatetempale = hibernatetempale;
	}
	
	

}
