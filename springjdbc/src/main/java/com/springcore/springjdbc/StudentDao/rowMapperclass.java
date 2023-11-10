package com.springcore.springjdbc.StudentDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.springjdbc.Student;

public class rowMapperclass implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student s=new Student();
		s.setId(rs.getInt(1));
		s.setPersonName(rs.getString(2));
		s.setPersonAge(rs.getInt(3));
		s.setPersonBloodGroup(rs.getString(4));
		s.setPersonHeight(rs.getString(5));
		return s;
	}
	

}
