Task Executor Application
The Task Executor Application is a simple Java program that allows users to input tasks with priorities, schedules and executes those tasks based on their priorities using a PriorityQueue. This README provides an overview of the application's structure and usage.

Table of Contents
Prerequisites
Getting Started
Usage
Example
License
Prerequisites
Before running the Task Executor Application, ensure that you have the following prerequisites installed on your system:

Java Development Kit (JDK)
Getting Started
Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/task-executor.git
Navigate to the project directory:

bash
Copy code
cd task-executor
Compile the Java source files:

bash
Copy code
javac Main.java
Usage
The Task Executor Application allows users to input tasks and their priorities and then executes those tasks based on their priorities. To use the application, follow these steps:

Run the compiled Java program:

bash
Copy code
java Main
The program will prompt you to enter task names and priorities. You can input as many tasks as you like. To exit the input loop, simply enter "q" as the task name.

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
In this example, three tasks (A, B, and C) were entered with priorities, and the program executed them in descending order of priority.

License
This Task Executor Application is provided under the MIT License. You can find the license details in the LICENSE file in the project directory.
