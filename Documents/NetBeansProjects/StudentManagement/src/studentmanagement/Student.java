/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.Date;

/**
 *
 * @author Madhav Gupta
 */
public class Student {
    private int rollno;
    private String name;
    private Date date;
    private String fname;

    public Student(int rollno, String name, Date date, String fname) {
        this.rollno = rollno;
        this.name = name;
        this.date = date;
        this.fname = fname;
    }
    
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    
    
}
