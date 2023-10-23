# Task Executor Application

The Task Executor Application is a Java program that allows users to input and execute tasks based on their priorities. This README provides an overview of the application, its structure, and usage.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Example](#example)
- [License](#license)

## Prerequisites

Before using the Task Executor Application, ensure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)

## Getting Started

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/your-username/task-executor.git
   ```

Navigate to the project directory:

bash
Copy code
cd task-executor
Compile the Java source files:

bash
Copy code
javac Main.java
Usage
The Task Executor Application allows users to input tasks and their priorities, then execute those tasks based on their priorities. To use the application, follow these steps:

Run the compiled Java program:

bash
Copy code
java Main
The program will prompt you to enter task names and priorities. You can input as many tasks as you like. To exit the input loop, enter "q" as the task name.

Once you've entered all the tasks, the program will execute the tasks in descending order of priority.

The execution of tasks is displayed on the console.

Example
Let's walk through an example of using the Task Executor Application:

less
Copy code
Enter task name (or 'q' to quit): Task A
Enter task priority: 3

Enter task name (or 'q' to quit): Task B
Enter task priority: 1

Enter task name (or 'q' to quit): Task C
Enter task priority: 2

Enter task name (or 'q' to quit): q
Executing Task: Task A with priority 3
Executing Task: Task C with priority 2
Executing Task: Task B with priority 1
