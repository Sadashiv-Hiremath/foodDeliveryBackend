package com.foodproject.owner;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ownerId;
    private String firstName;
    private String lastName;
    private String address;
    private String emailId;
    private String password;

    public Owner(String firstName, String lastName, String address, String emailId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.emailId = emailId;
        this.password = password;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


