package com.springcore.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.springjdbc.StudentDao.StudentImp;
import com.springcore.springjdbc.StudentDao.StudentDao;

@Configuration
@ComponentScan("com.springcore.springjdbc.StudentDao")

public class config {
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/student");
		datasource.setUsername("root");
		datasource.setPassword("Siraj12@1");
		return datasource;
		
	}
	@Bean("stu")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
//	@Bean
//	public StudentImp student()
//	{
//		StudentImp stu=new StudentImp();
//		stu.setTemplate(getTemplate());
//		return stu;
//		
//	}
//	

}
