package com.demo.test.Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Employee_Table")
public class Employee{
    @Id
   @GeneratedValue

    private Integer id;
    @Column()
    String firstName;
    @Column()
    String lastName;
    @Column()
    String socialNumber;
    @Column()
    String workPhone;
    @Column()
    String homePhone;
    @Column()
    String email;
    @Column()
    String streetAddress;
    @Column()
    String aptNumber;
    @Column()
    String city;
    @Column()
    String state;
    @Column()
    String zip;

    public Employee(String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumber = socialNumber;
        this.workPhone = workPhone;
        this.homePhone = homePhone;
        this.email = email;
        this.streetAddress = streetAddress;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Employee() {

    }

    private Integer getId() { return id; }

    private void setId(int i) { this.id = id; }

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

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}