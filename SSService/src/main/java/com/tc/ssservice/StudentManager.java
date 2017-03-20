/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.ssservice;

import com.tc.ssdao.SSStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Pure Evil
 */
public class StudentManager {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ServiceBeans.xml");
        SSStudent student = new SSStudent();
        student.setfName("Bob");
        student.setlName("Smith");
        student.setdOb("1/1/1989");
        System.out.println("First Name = " + student.getfName() + "\n" + "Last Name = " +student.getlName() + "\n" + "Student DOB = " +student.getdOb());
        SSStudent ssstudent = (SSStudent) appContext.getBean("ssAddress");
        ssstudent.printAddress();
        SSStudent ssstudent2 = (SSStudent) appContext.getBean("ssGrade");
        ssstudent2.printGrade();

    }
}
