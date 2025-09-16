package com.taskmanagementapp.models;


public class SchoolTask extends Task {
    private String courseName;
    private Date dueDate;
    private boolean isSubmitted = false;
    private float progress;

    public SchoolTask(String title, String courseName, String description, String category, Date dueDate){
        super(title, description, category);
        this.courseName = courseName;
        this.dueDate = dueDate;
    }
    public void submit(){
        toggleComplete();
        isSubmitted = !isSubmitted;
    }

    @Override
    public void getDetails(){
        System.out.println("Course: " + this.courseName + " Assignment name: " + this.title + " Due Date: " + this.dueDate.getDate() + " " + getSubmitted());
        System.out.println("Description: " + this.description);
    }

    @Override
    public String toString() {
        return "SchoolTask{" +
                "courseName='" + courseName + '\'' +
                ", dueDate=" + dueDate +
                ", isSubmitted=" + isSubmitted +
                ", progress=" + progress +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        courseName = courseName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getSubmitted() {
        if(isSubmitted){
            return "Assignment submitted!";
        } else {
            return "Assignment not submitted!";
        }
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }
}
