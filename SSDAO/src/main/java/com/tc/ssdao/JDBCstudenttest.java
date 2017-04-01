/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.ssdao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author w208033650
 */
public class JDBCstudenttest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextDAO.xml");

        JDBCstudent sdb = (JDBCstudent) ctx.getBean("sdao");
        int status = sdb.saveStudent(new SSStudent("John", "Smith", "2/2/1991"));
        System.out.println(status);

        /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
    System.out.println(status); 
         */
 /*Employee e=new Employee(); 
    e.setId(102); 
    int status=dao.deleteEmployee(e); 
    System.out.println(status);*/
    }

}
