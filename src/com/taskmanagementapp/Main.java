package com.taskmanagementapp;
import com.taskmanagementapp.models.*;
import com.taskmanagementapp.services.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Instantiate TaskManager object 'taskManager'
        TaskManager taskManager = new TaskManager();
        // Instantiate user input
        Scanner keyboard = new Scanner(System.in);
        boolean outer = true;
        boolean inner = true;

        // do-while Loop based menu
        do{
           displayMenu();
           int choice1 = keyboard.nextInt();
           keyboard.nextLine();
            // Outer switch for main menu
           switch(choice1){

               case 1: // Case for adding a taskManager

                   do { // inner do-while loop for case 1

                   addTaskMenu();
                   int choice2 = keyboard.nextInt();
                   keyboard.nextLine();


                       //inner switch for adding corresponding taskManager
                       switch (choice2) {

                           case 1: // adding a personal task
                               System.out.print("Enter title: ");
                               String pTitle = keyboard.nextLine();
                               System.out.print("Enter Description: ");
                               String pDescription = keyboard.nextLine();
                               System.out.print("Enter Category: ");
                               String pCategory = keyboard.nextLine();
                               System.out.print("Any notes? (Enter if none): ");
                               String pNotes = keyboard.nextLine();
                               System.out.print("Any location? (Enter if none): ");
                               String pLocation = keyboard.nextLine();
                               taskManager.addTask(new PersonalTask(pTitle, pDescription, pCategory, pNotes, pLocation));
                               System.out.println("Personal task added!");

                               break;

                           case 2: // adding a work task case
                               System.out.print("Enter title: ");
                               String wTitle = keyboard.nextLine();
                               System.out.print("Enter Description: ");
                               String wDescription = keyboard.nextLine();
                               System.out.print("Enter Category: ");
                               String wCategory = keyboard.nextLine();
                               System.out.print("Enter Designated assignee first and last name: ");
                               String wFirst = keyboard.next();
                               String wLast = keyboard.next();
                               System.out.print("Enter Designated assignee department: ");
                               String wDepartment = keyboard.nextLine();
                               System.out.print("Enter Priority level (1-10): ");
                               int prioirty = keyboard.nextInt();
                               keyboard.nextLine();
                               taskManager.addTask(new WorkTask(wTitle, new Assignee(wFirst, wLast,wDepartment), wDescription, wCategory, prioirty));
                               System.out.println(wTitle + " task added!");

                               break;

                           case 3: // adding a school task
                               System.out.print("Enter title: ");
                               String sTitle = keyboard.nextLine();
                               System.out.print("Enter Description: ");
                               String sDescription = keyboard.nextLine();
                               System.out.print("Enter Category: ");
                               String sCategory = keyboard.nextLine();

                               break;

                           default:
                               System.out.println("Invalid input!");
                       }

                       System.out.print("Continue with adding tasks? 1/yes 2/no: ");
                       if(keyboard.nextInt() == 2){
                           keyboard.nextLine();
                           inner = false;
                       }
                   }while(inner);
                   break;


               case 2: // Removing taskManager case
                   System.out.print("Enter task Title to remove: ");

                   String taskTitle = keyboard.nextLine();
                   Task taskToRemove = taskManager.getTask(taskTitle);

                    if(taskToRemove != null){
                        taskManager.removeTask(taskToRemove);
                    } else{
                        System.out.println("Invalid title! Task does not exist!");
                    }

                   break;
               case 3: // Search taskManager case
                   System.out.print("Enter task title to search: ");
                   String titleToSearch = keyboard.nextLine();
                   Task taskToSearch = taskManager.getTask(titleToSearch);

                   if(taskToSearch != null){
                       taskToSearch.getDetails();
                   } else{
                       System.out.println("Invalid title! Task does not exist!");
                   }

                   break;
               case 4: // Display of tasks case
                   if(taskManager.size() == 0){
                       System.out.println("No tasks to display");
                   } else {
                       taskManager.printTasks();
                   }
                   break;
               default:
                   System.out.println("Invalid input");
           }



            System.out.print("Continue in main menu? 1/yes 2/no: ");

           if(keyboard.nextInt() != 1){
               outer = false;
           }

        }while(outer);


    }
    public static void addTaskMenu(){
        System.out.print("Type of tasks\n" +
                            "1.Personal\n" +
                            "2.Work\n" +
                            "3.School\n" +
                            "Enter desired task to add (number): ");
    }

    public static void displayMenu(){
        System.out.print( "Welcome to the task tracker app\n" +
                        "1.Add task\n" +
                        "2.Remove task\n" +
                        "3.Find task\n" +
                        "4.Display tasks\n" +
                        "Enter desired task functionality: ");
    }


}
