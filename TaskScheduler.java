package taskScheduler;

import java.util.PriorityQueue;

class Task {
    String description;

    public Task(String description) {
        this.description = description;
    }
}

class TaskScheduler {
    private PriorityQueue<Task> taskQueue;

    public TaskScheduler() {
        taskQueue = new PriorityQueue<>((task1, task2) -> {
            // Customize the priority logic here
            return 0; // For simplicity, no specific priority logic is added in this example
        });
    }

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public Task executeNextTask() {
        return taskQueue.poll();
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Adding tasks
        scheduler.addTask(new Task("Task 1"));
        scheduler.addTask(new Task("Task 2"));
        scheduler.addTask(new Task("Task 3"));

        // Executing tasks
        Task executedTask1 = scheduler.executeNextTask();
        Task executedTask2 = scheduler.executeNextTask();
        Task executedTask3 = scheduler.executeNextTask();

        // Print executed tasks (you can customize this part based on your needs)
        System.out.println("Executed Task 1: " + executedTask1.description);
        System.out.println("Executed Task 2: " + executedTask2.description);
        System.out.println("Executed Task 3: " + executedTask3.description);
    }
}