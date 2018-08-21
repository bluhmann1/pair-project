package com.solstice.cloud.employeeservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
//    @GeneratedValue
    private Integer employeeNumber;
    private String firstName;
    private String lastName;
    private String office;
    private String title;
    private String email;
    @Column(name="IMAGE_URL")
    private String imageURL;

    public Employee() { }

    // only for testing, generally we'd have no employeeNumber and would let that be autogenerated
    public Employee(String firstName, String lastName, String office, String title, String email, String imageURL, Integer employeeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.office = office;
        this.title = title;
        this.email = email;
        this.imageURL = imageURL;
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "firstName: " + this.firstName + "\nlastName: " + this.lastName + "\noffice: " + this.office + "\nemail: " + this.email + "\nimageURL: " + this.imageURL + "\n-----\n";
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOffice() {
        return office;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getImageURL() {
        return imageURL;
    }
}
