package com.taskmanagementapp.models;

import com.taskmanagementapp.interfaces.Prioritization;

public class WorkTask extends Task implements Prioritization {
    private Assignee assignee;
    private int priority;

    public WorkTask(String title, Assignee assignee, String description, String category, int priority){
    super(title, description, category);
    this.assignee = assignee;
    this.priority = priority;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        assignee.getDetails();
        System.out.println("Description: " + this.description);
        System.out.println("Priority: " + calculatePriority(priority));
    }

    @Override
    public String toString() {
        return "WorkTask{" +
                "assignee=" + assignee +
                ", priority=" + priority +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }

    @Override
    public String calculatePriority(int num) {
        return switch (num) {
            case 1, 2, 3 -> "LOW";
            case 4, 5, 6 -> "MEDIUM";
            case 7, 8, 9, 10 -> "HIGH";
            default -> "Invalid number, must be between 1-10";
        };
    }
}
