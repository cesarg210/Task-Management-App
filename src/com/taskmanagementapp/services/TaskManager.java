package com.taskmanagementapp.services;
import com.taskmanagementapp.datastructures.DoublyLinkedList;
import com.taskmanagementapp.models.*;

public class TaskManager {
    private DoublyLinkedList<Task> tasks = new DoublyLinkedList<>();

    // adds task
    public void addTask(Task task) {
        tasks.append(task);
    }

    // removes task
    public void removeTask(Task t) {
        if(tasks.removeByData(t)){
            System.out.println(t.getTitle() + " task removed!");
        } else {
            System.out.println("Task does not exist!");
        }
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks +
                '}';
    }

    // prints list of tasks
    public void printTasks(){
        tasks.printList();
    }

    // Finds task based on title property in list
    public Task getTask(String title){
        for(int i = 0; i < tasks.size(); i++) {

            Task task = tasks.get(i).getData();

            if(task.getTitle().equals(title)){
                return task;
            }
        }
        return null;
    }

    // returns number of tasks
    public int size(){
        return tasks.size();
    }
}
