# Task Management Application

## Overview
This Java application is designed to manage different types of tasks, including personal, work, and school tasks. It uses a modular design with object-oriented principles, incorporating a doubly linked list for data storage and interfaces for extensible functionality. The application supports task prioritization, completion toggling, and detailed task information display.

This project will be developed into a full-stack application, expanding on the current backend foundation by implementing advanced data structures and algorithms for efficient task handling, and integrating SQL databases for persistent storage. A RESTful API will be built to enable frontend interactions, with plans for a web or mobile interface.

## Project Structure
The project is organized into three main packages:
- **com.taskmanagementapp.datastructures**: Contains data structure implementations.
  - `DoublyLinkedList.java`: A generic doubly linked list implementation for storing tasks.
- **com.taskmanagementapp.interfaces**: Defines interfaces for task behavior.
  - `CompleteToggle.java`: Interface for toggling task completion status.
  - `Prioritization.java`: Interface for calculating task priority.
- **com.taskmanagementapp.models**: Contains task-related classes and models.
  - `Task.java`: Abstract base class for all task types, implementing `CompleteToggle`.
  - `PersonalTask.java`: Extends `Task` for personal tasks with attributes like notes, location, and reminders.
  - `WorkTask.java`: Extends `Task` and implements `Prioritization` for work-related tasks with assignee and priority.
  - `SchoolTask.java`: Extends `Task` for school assignments with course name, due date, and submission status.
  - `Assignee.java`: Represents an assignee for work tasks with name and department details.
  - `Date.java`: Custom date class for handling task dates (e.g., due dates, reminders).
- **com.taskmanagementapp.services**: Contains service classes for managing tasks.
  - `TaskManager.java`: A generic class for task management operations (currently a placeholder).

## Features
- **Task Types**:
  - **Personal Tasks**: Support notes, recurrence, location, and reminders.
  - **Work Tasks**: Include assignee details and priority levels (LOW, MEDIUM, HIGH).
  - **School Tasks**: Track course name, due date, submission status, and progress.
- **Data Structure**: Uses a generic `DoublyLinkedList` for efficient task storage and manipulation.
- **Interfaces**:
  - `CompleteToggle`: Allows toggling completion status for all tasks.
  - `Prioritization`: Defines priority calculation for work tasks.
- **Extensibility**: Abstract `Task` class and interfaces make it easy to add new task types.

## Setup Instructions
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
   - IntelliJ IDEA (Community or Ultimate edition).

2. **Clone or Import the Project**:
   - Clone the project repository or import the project folder into IntelliJ IDEA.
   - Ensure the project is recognized as a Java project (a `src` folder should contain the `com.taskmanagementapp` package).

3. **Configure the Project in IntelliJ**:
   - Open IntelliJ IDEA and select **File** > **Open**, then navigate to the project folder.
   - If using a build tool (e.g., Maven or Gradle), ensure the `pom.xml` or `build.gradle` file is configured and dependencies are resolved.
   - If not using a build tool, set up the JDK:
     - Go to **File** > **Project Structure** > **Project** and select a valid JDK.
     - Mark the `src` directory as the source root (right-click `src` > **Mark Directory as** > **Sources Root**).

4. **Run the Application**:
   - The current codebase lacks a `main` method. To test, create a new class with a `main` method (e.g., in `com.taskmanagementapp` package) to instantiate and manipulate tasks.
   - Example test code:
     ```java
     package com.taskmanagementapp;

     import com.taskmanagementapp.models.*;
     import com.taskmanagementapp.datastructures.DoublyLinkedList;

     public class Main {
         public static void main(String[] args) {
             DoublyLinkedList<Task> taskList = new DoublyLinkedList<>(null);
             Task task = new PersonalTask("Grocery Shopping", "Buy groceries", "Personal", "Bring reusable bags", false, "Supermarket", new Date(10, 15, 2025));
             taskList.append(task);
             task.getDetails();
         }
     }
     ```
   - Right-click the `Main` class in IntelliJ and select **Run**.

5. **Build and Test**:
   - Use IntelliJ’s **Build** > **Build Project** to compile the code.
   - Add unit tests (e.g., using JUnit) in a `test` directory to verify functionality.

## Usage
- **Creating Tasks**:
  - Instantiate specific task types (`PersonalTask`, `WorkTask`, `SchoolTask`) with relevant attributes.
  - Add tasks to the `DoublyLinkedList` using `append` or `prepend` methods.
- **Managing Tasks**:
  - Use `toggleComplete()` to mark tasks as complete/incomplete.
  - For `WorkTask`, use `calculatePriority(int)` to determine priority.
  - For `SchoolTask`, use `submit()` to toggle submission status.
- **Displaying Details**:
  - Call `getDetails()` on any task to print its attributes.

## Future Improvements
- Implement `TaskManager` to handle task CRUD operations and list management.
- Expand data structures and algorithms: Integrate sorting algorithms (e.g., quicksort for priority-based task ordering), search algorithms (e.g., binary search on sorted lists), and additional structures like hash maps for quick task lookups.
- Full-stack development: 
  - Backend: Build a Spring Boot API for RESTful endpoints (e.g., `/tasks` for CRUD operations).
  - Database: Use SQL (e.g., MySQL or PostgreSQL) for persistent storage of tasks, assignees, and dates, with JPA/Hibernate for ORM.
  - Frontend: Develop a React or Angular interface to interact with the API, allowing users to create, view, edit, and delete tasks via a web UI.
- Add a `main` method or CLI/GUI for user interaction.
- Integrate a proper `Date` class (e.g., use `java.time.LocalDate` instead of custom `Date`).
- Add persistence (e.g., file or database storage).
- Include unit tests for robust validation.

## Known Issues
- The `TaskManager` class is currently empty and needs implementation.

## Contributing
- Feel free to fork the repository and submit pull requests for enhancements or bug fixes.
- Follow Java naming conventions and add comments for clarity.

## License
This project is unlicensed. Use it freely, but please provide attribution if you share or modify it.
