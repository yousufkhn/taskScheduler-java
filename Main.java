import java.util.PriorityQueue;
import java.util.Scanner;
import entities.Task;
import utils.TaskExecutor;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> t2.priority - t1.priority);

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Taking tasks as inputs from the user
        while (true) {
            System.out.print("Enter task name (or 'q' to quit): ");
            String name = scanner.nextLine();

            if (name.equals("q")) {
                break;
            }

            System.out.print("Enter task priority: ");
            int priority = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            taskQueue.add(new Task(name, priority));
        }

        // Close the scanner
        scanner.close();

        // Schedule and execute tasks based on their priorities
        TaskExecutor.executeTasks(taskQueue);

    }
}
