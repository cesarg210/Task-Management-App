package com.taskmanagementapp.models;

public class Assignee {
    private String firstName;
    private String lastName;
    private String department;

    Assignee(String firstName, String lastName, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    public void getDetails(){
        System.out.println("com.taskmanagementapp.models.Assignee Name: " + firstName + " " + lastName + " Department: " + department);
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
