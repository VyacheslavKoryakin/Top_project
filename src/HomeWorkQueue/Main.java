package HomeWorkQueue;

import static HomeWorkQueue.TaskManager.*;


public class Main {
    public static void main(String[] args) {


        Task task1 = new Task("task1", 2, "bugs");
        Task task2 = new Task("task2", 1, "write");
        Task task3 = new Task("task3", 2, "documentation");
        Task task4 = new Task("task4", 1, "coding");
        Task task5 = new Task("task5", 3, "check");

        addTask(task1);
        addTask(task2);
        addTask(task3);
        addTask(task4);
        addTask(task5);

        System.out.println(poolTask());
        System.out.println(poolTask());
        System.out.println(poolTask());
        System.out.println(poolTask());
        System.out.println(poolTask());

    }
}
