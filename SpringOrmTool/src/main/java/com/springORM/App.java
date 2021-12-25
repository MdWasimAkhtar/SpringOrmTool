package com.springORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.dao.EmpDao;
import com.springORM.dao.StudentDao;

public class App 
{
    public static void main( String[] args ){
       
          ApplicationContext   context=new ClassPathXmlApplicationContext("config.xml");
          
          StudentDao studDao = context.getBean("student1" , StudentDao.class);
          
//          EmpDetails emp1 = new EmpDetails(1213008,"Shilpa" , "designer", 40000);
         
//          int update = empDao.insert(emp1);
//          System.out.println(emp1);
//          
//          Subjects subj1 = new Subjects();
//          subj1.setChemistryMarks(67);
//          subj1.setMathMarks(88);
//          subj1.setPhysicsMarks(75);
//          subj1.setTotalMarks(230);
//          subj1.setName("Shilpa");
//          
//          Student student1 = new Student("1sp16cs043", subj1);
//          
//          int updateCount = studDao.insert(student1);
//          System.out.println(updateCount);
          
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          boolean go=true;
          while(go) {
        	  
        	  System.out.println("press 1 for add new Student");
        	  System.out.println("press 2 for display all Student");
        	  System.out.println("press 3 for get details of single Student");
        	  System.out.println("press 4 for delete Student");
        	  System.out.println("press 5 for update Student");
        	  System.out.println("press 0 to EXIT ");
        	  
        	  try {
        		  
        		  int input=Integer.parseInt(br.readLine());
        		  switch(input) {
        		  
        		  case 0 :
        			  break;
        			  
        		  case 1 :
        			  System.out.println("Enter Student Id");
        			  break;
        		   
        		  case 2 :
        			  break;
        			  
        		  case 3 :
        			  break;
        			  
        		  case 4 :
        			  break;
        		  
        		  }
        		  
        		  
        		  
        		  
        	  }
        	  catch(Exception e ) {
        		  System.out.println("Invalid Input");
        		  System.out.println(e.getMessage());
        	  }
        	  
        	  
          }
          
          System.out.println("Thank You for Using my Application ");
          
    }
}
