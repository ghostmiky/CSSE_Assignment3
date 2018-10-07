/*This Entity class represents the Class Authorized_Employee in the class diagram
 * Author:It16133464
 * */

package com.sql.csse.EntityManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This class is mapped with the policy table in the database
 */

// signifies that the class is an entity
@Entity
//the class maps to
@Table(name="POLICY")
public class Policy{
    //auto generated ID
    @Id
    @GeneratedValue
    @Column(name="PolicyID")
    private int PolicyID;

    @Column(name="Description")
    private String Description;

    public Policy(int PolicyID, String Description){
        this.PolicyID = PolicyID;
        this.Description = Description;
    }

    public int getPolicyID(){return PolicyID; }

    public int setPolicyId(int PolicyID){this.PolicyID = PolicyID; }

    public int getDescription(){return Description; }

    public int setDescription(int Description){this.Description = Description; }


}