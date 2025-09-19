package com.taskmanagementapp;
import com.taskmanagementapp.models.*;
import com.taskmanagementapp.datastructures.DoublyLinkedList;
import com.taskmanagementapp.services.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Instantiate TaskManager object 'task'
        TaskManager task = new TaskManager();
        // Initiate user input
        Scanner keyboard = new Scanner(System.in);
        boolean running = true;

        // do-while Loop based menu
        do{
           displayMenu();
           int choice1 = keyboard.nextInt();



           switch(choice1){
               case 1: // Case for adding a task
                   addTaskMenu();
                   int choice2 = keyboard.nextInt();
                   //inner switch for adding corresponding task
                    switch(choice2){
                        case 1:


                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:

                    }


                   break;
               case 2: // Removing task case
                   System.out.print("Enter task Title to remove: ");
                   String title = keyboard.next();
                   Task taskToRemove = task.getTask(title);

                    if(taskToRemove != null){
                        task.removeTask(taskToRemove);
                    } else{
                        System.out.println("Invalid title! Task does not exist!");
                    }

                   break;
               case 3: // Search task case
                   System.out.print("Enter task title to search: ");
                   String titleToSearch = keyboard.next();
                   Task taskToSearch = task.getTask(titleToSearch);

                   if(taskToSearch != null){
                       taskToSearch.getDetails();
                   } else{
                       System.out.println("Invalid title! Task does not exist!");
                   }

                   break;
               case 4: // Add display of tasks case

                   break;
               default:
                   System.out.println("Invalid input");
           }



            System.out.print("Continue in main menu? 1/yes 2/no: ");

           if(keyboard.nextInt() != 1){
               running = false;
           }

        }while(running);


    }
    public static void addTaskMenu(){
        System.out.print("Type of tasks\n" +
                            "1.Personal\n" +
                            "2.Work\n" +
                            "3.School\n" +
                            "Enter desired task to add (number): ");
    }

    public static void displayMenu(){
        System.out.print( "Welcome to te task tracker app\n" +
                        "1.Add task\n" +
                        "2.Remove task\n" +
                        "3.Find task\n" +
                        "4.Display tasks" +
                        "Enter desired task functionality: ");
    }

}
