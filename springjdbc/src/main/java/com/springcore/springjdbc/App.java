package com.springcore.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springjdbc.StudentDao.StudentImp;

public class App 
{
    public static void main( String[] args ) 
    {
//    	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springjdbc/springcore.xml");
//    	StudentImp stu=(StudentImp)context.getBean("studentI"); 
    	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
    	StudentImp stu=context.getBean("student",StudentImp.class);
    
    	
//    	Insert............................................
    	Student s=new Student(8, "Sergio Romos", 35, "A-", "8.2");
//    	int result=stu.insert(s);
//    	System.out.println("Data inserted "+result+" time");
    	
    	
    	
//    	Updation................................................
    	
//    	Student s=new Student();
//    	s.setId(1);
//    	s.setPersonName("Salha");
//    	s.setPersonAge(31);
//    	int result=stu.chage(s);
//    	System.out.println("Data update "+result+" time");
//    	Student s=new Student();
//    	s.setId(65);
//    	int result=stu.delete(s);
//    	System.out.println("Data deleted "+result+" time");
//    	Fetch.............................................
    	
//    	Student s=new Student();
    	s.setId(7);
    	s=stu.getStudent(s);
    	System.out.println(s);
//    	multiple fetching................
//    	List<Student>s=stu.getallstudents();
//    	System.out.println(s);
    	
    }
}
