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
public class JDBCstudenttest extends JDBCstudent {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextDAO.xml");

        JDBCstudent sdb = (JDBCstudent) ctx.getBean("sdao");
        /*int status = sdb.saveStudent(new SSStudent("John", "Smith", "1/1/1981"));
        System.out.println(status);

        
        sdb.update(new SSStudent("Jackass", "Jones", "2/2/1991"));*/

        SSStudent s = new SSStudent();
        s.setlName("Smith");
        int status = sdb.deleteStudent(s);
        System.out.println(status);  
    }

}
