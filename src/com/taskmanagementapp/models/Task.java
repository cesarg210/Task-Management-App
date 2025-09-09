package com.taskmanagementapp.models;

import com.taskmanagementapp.interfaces.CompleteToggle;

public abstract class Task implements CompleteToggle {
    protected String title;
    protected String description;
    protected String category;
    protected boolean isComplete = false;


    Task(String title, String description, String category){
        this.title = title;
        this.description = description;
        this.category = category;
    }

    @Override
    public void toggleComplete(){
        isComplete = !isComplete;
    }

    public void getDetails(){
        System.out.println("Title: " + this.title + " Category: " + this.category + " Status: " + getStatus());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {

        if(isComplete){ return "Complete"; }

        else { return "Incomplete"; }

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
