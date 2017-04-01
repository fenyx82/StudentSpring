/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.ssdao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author w208033650
 */
public class JDBCstudent {
    
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveStudent(SSStudent s){  
    String query="insert into student values('"+s.getfName()+"','"+s.getlName()+"','"+s.getdOb()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updateStudent(SSStudent s){  
    String query="update student set firstname='"+s.getfName()+"',lastname='"+s.getlName()+"' DOB='"+s.getdOb()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteStudent(SSStudent s){  
    String query="delete from student where id='"+s.getlName()+"' ";  
    return jdbcTemplate.update(query);  
}  
  
}  