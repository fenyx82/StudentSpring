/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.ssdao;

/**
 *
 * @author Pure Evil
 */
public class SSGrade extends SSStudent {

    String subject;
    char grade;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void gradeDisplay() {
        System.out.println ("Student's grade in " + subject + " is " + grade);
    }
}
