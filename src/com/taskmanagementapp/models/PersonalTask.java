package com.taskmanagementapp.models;


public class PersonalTask extends Task {
    private String notes;
    private boolean isRecurring;
    private String location;
    private Date reminder;

    public PersonalTask(String title, String description, String category,
                        String notes, String location) {
        super(title, description, category);
        this.notes = notes;
        this.location = location;
    }
    PersonalTask(){
        this.notes = "None";
        this.isRecurring = false;
        this.location = "None";
        this.reminder = null;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Location: " + this.location);
        System.out.println("Description: " + this.description);
        System.out.println("Notes: " + this.notes);
    }

    @Override
    public String toString() {
        return "Personal Task\n" +
                "------------------\n" +
                "Title: " + title + "\n" +
                "Category: " + category + "\n" +
                "Description: " + description + "\n" +
                "Location: " + location + "\n" +
                "Reminder: " + reminder + "\n" +
                "Recurring: " + isRecurring + "\n";
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getReminder() {
        return reminder;
    }

    public void setReminder(Date reminder) {
        this.reminder = reminder;
    }
}
