package com.taskmanagementapp.services;
import com.taskmanagementapp.datastructures.DoublyLinkedList;
import com.taskmanagementapp.models.*;

public class TaskManager {
    private DoublyLinkedList<Task> tasks = new DoublyLinkedList<>();


    public void addTask(Task task) {
        tasks.append(task);
        System.out.println("Task Added!");
    }

    public Task removeTask(Task t) {
        if(tasks.removeByData(t)){
            tasks.removeByData(t);
            System.out.println(t.getTitle() + " task removed!");
        } else {
            System.out.println("Task does not exist!");
        }
        return t;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks +
                '}';
    }

    public void printTasks(){
        tasks.printList();
    }

    // implement public Task getTask(String title)

}
