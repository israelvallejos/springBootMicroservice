package com.example.springbootmysql.Dtos;

import java.util.Date;

public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String email;

    private Date hireDate;

    private String jobTitle;

    private String deparment;

    private String phoneNumber;

    private double salary;


    public EmployeeDTO() {
    }

    public EmployeeDTO(String firstName, String lastName, String email, Date hireDate, String jobTitle,
                       String deparment, String phoneNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.jobTitle = jobTitle;
        this.deparment = deparment;
        this.phoneNumber = phoneNumber;
        this.salary = salary;

    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return deparment;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setDepartment(String deparment) {
        this.deparment = deparment;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
