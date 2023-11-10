package com.springcore.springjdbc.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.springjdbc.Student;
@Component("student")
public class StudentImp implements StudentDao
{
	@Autowired
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(Student s) {
		//insert
		
		String query="insert into students(id,name,age,blood_group,height)values(?,?,?,?,?)";
		int result=this.template.update(query,s.getId(),s.getPersonName(),s.getPersonAge(),s.getPersonBloodGroup(),s.getPersonHeight());
		
		return result;
	}

	@Override
	public int chage(Student s) {
		// update
		String query="update students set name=?, age=? where id=?";
		int result=this.template.update(query,s.getPersonName(),s.getPersonAge(),s.getId());
		
		return result;
	}

	@Override
	public int delete(Student s) {
		//delete
		String query="delete from students where id=?";
		int result=this.template.update(query,s.getId());
		return result;
	}

	@Override
	public Student getStudent(Student s) {
//		Fetching single row
//		RowMapper<Student> rw=new rowMapperclass();
		String query="select * from students where id=?";
		Student s1=this.template.queryForObject(query, new rowMapperclass(),s.getId());
		
		
		return s1;
	}

	@Override
	public List<Student> getallstudents() {
		// Fetching Multiple row
		String query="Select * from students where id=?";
		List s=this.template.query(query,new rowMapperclass(),7);
		return s;
	}
	
	
	
}