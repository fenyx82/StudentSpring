/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.ssdao;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.*;

/**
 *
 * @author w208033650
 */
public class JDBCstudent extends SSStudent {

    private String updateSql;
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveStudent(SSStudent s) {
        String query = "insert into student values('" + s.getfName() + "','" + s.getlName() + "','" + s.getdOb() + "')";
        return jdbcTemplate.update(query);
    }

    public void update(SSStudent s) {
        updateSql = "update student set firstname=?,lastname=? where dob=?";
        jdbcTemplate.update(updateSql, new Object[]{s.getfName(), s.getlName(), s.getdOb()});
    }

    public int deleteStudent(SSStudent s) {
        String query = "delete from student where lastname='" + s.getlName() + "' ";
        return jdbcTemplate.update(query);
    }

}
