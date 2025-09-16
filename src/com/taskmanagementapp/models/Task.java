package com.taskmanagementapp.models;
import com.taskmanagementapp.interfaces.CompleteToggle;

/**
 * Represents a task with a title, description, and category.
 * Used for managing tasks in a to-do list or project management system.
 * Throws {@link IllegalArgumentException} for invalid inputs during creation.
 */
public abstract class Task implements CompleteToggle {
    protected String title;
    protected String description;
    protected String category;
    protected boolean isComplete = false;


    Task(String title, String description, String category) throws IllegalArgumentException{
        if(title.isEmpty()){
            throw new IllegalArgumentException("Task title cannot be empty");
        }
        this.title = title;

        this.description = description;
        this.category = category;
    }

    @Override
    public void toggleComplete(){
        isComplete = !isComplete;
    }
    /**
     * TO DO: Update All toString methods
     */
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isComplete=" + isComplete +
                '}';
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
