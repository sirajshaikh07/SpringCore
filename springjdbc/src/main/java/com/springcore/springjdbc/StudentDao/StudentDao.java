package com.springcore.springjdbc.StudentDao;

import java.util.List;

import com.springcore.springjdbc.Student;

public interface StudentDao
{
	public int insert(Student s);
	public int chage(Student  s);
	public int delete(Student s);
	public Student getStudent(Student s);
	public List<Student>getallstudents();
	
	
}