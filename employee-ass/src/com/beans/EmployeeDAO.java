package com.beans;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	@Autowired
private JdbcTemplate template;
	
	public void insert(Employee e) {
		template.update("insert into employee values(?, ?, ?, ?)", 
					new Object[] {e.getId(), e.getName(), e.getSalary(), e.getDesignation()});
	}
	public void delete(Employee e) {
		template.update("DELETE from employee where id = ?" , new Object[] {e.getId()});
	}
	
	
	
	public List<Employee> getAllEmployee() {
		List<Employee> list = template.query("select * from Employee",
					new EmployeeRowMapper());
		return list;
	}
	public void updateName(int id,String name) {
		template.update("UPDATE employee set name = ? where id = ?", new Object[] {name,id});
		
	}
	public void updateSalary(int id, Double salary) {
		template.update("UPDATE employee set salary = ? where id = ?", new Object[] {salary,id});
		
	}
	public void updateDesignation(int id, String designation) {
		template.update("UPDATE employee set designation = ? where id = ?", new Object[] {designation,id});
		
	}


}
