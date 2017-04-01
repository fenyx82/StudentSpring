/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.ssdao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Pure Evil
 */
public class SSStudent {

    @Autowired
    private SSAddress ssAddress;
    @Autowired
    private SSGrade ssGrade;
    String fName;
    String lName;
    String dOb;

    public SSStudent() {
    }

    public SSStudent(String fName, String lName, String dOb) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.dOb = dOb;
    }

    public SSAddress getSsAddress() {
        return ssAddress;
    }

    public void setSsAddress(SSAddress ssAddress) {
        this.ssAddress = ssAddress;
    }

    public SSGrade getSsGrade() {
        return ssGrade;
    }

    public void setSsGrade(SSGrade ssGrade) {
        this.ssGrade = ssGrade;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getdOb() {
        return dOb;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }

    public void printAddress() {
        ssAddress.addressDisplay();
    }

    public void printGrade() {
        ssGrade.gradeDisplay();
    }
}
