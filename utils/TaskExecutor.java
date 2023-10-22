package utils;

import entities.Task;
import java.util.PriorityQueue;

public class TaskExecutor {
    public static void executeTasks(PriorityQueue<Task> taskQueue) {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Executing Task: " + task.name + " with priority " + task.priority);
            // Add your task execution logic here
        }
    }
}