/*This Entity class represents the Class Authorized_Employee in the class diagram
 * Author:It16133464
 * */

package com.sql.csse.EntityManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This class is mapped with the Authorized_Employee table in the database
 */

// signifies that the class is an entity
@Entity
//table the class maps to
@Table(name="Manager")
public class Authorized_Employee {
    // auto generated id
    @Id
    @GeneratedValue
    @Column(name="EmployeeID")
    private int EmployeeID;

    @Column(name="EmployeeType")
    private String EmployeeType;

    @Column(name="Employee_FName")
    private String Employee_FName;

    @Column(name="Employee_LName")
    private String Employee_LName;

    @Column(name="Address")
    private String Address;

    @Column(name="Email")
    private String Email;

    @Column(name="Phone")
    private String Phone;

    public Manager(int EmployeeID, String EmployeeType, String Employee_FName, String Employee_LName, String Address,  String Email, String Phone){

        this.EmployeeID =EmployeeID;
        this.EmployeeType = EmployeeType;
        this.Employee_FName =Employee_FName;
        this.Employee_LName = Employee_LName;
        this.Address = Address;
        this.Email = Email;
        this.Phone = Phone;
    }

    public int getEmployeeID() {return EmployeeID;}

    public void setEmployeeID(int EmployeeID) {this.EmployeeID = EmployeeID; }


    public String getEmployeeType() {return EmployeeType; }

    public void setEmployeeType(String EmployeeType) {this.EmployeeType = EmployeeType; }


    public String getEmployee_FName() {return Employee_FName; }

    public void setEmployee_FName(String Employee_FName) {this.Employee_FName = Employee_FName; }


    public String getEmployee_LName() {return Employee_LName; }

    public void setEmployee_LName(String Employee_LName) {this.Employee_LName = Employee_LName; }


    public String getAddress() {return Address; }

    public void setAddress(String Address) {this.Address = Address; }


    public String getEmail() {return Email; }

    public void setEmail(String Email) {this.Email = Email; }


    public String getPhone() {return Phone; }

    public void setPhone(String Phone) {this.Phone = Phone; }


    @Override
    public String toString(){
        return "manager : "+ getEmployeeID() + ", type : "+getEmployeeType() ;
    }
