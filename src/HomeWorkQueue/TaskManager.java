package HomeWorkQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskManager {
    protected static Queue<Task> tasks = new PriorityQueue<>();

    /**
     * Метод принимает задачу TASK и добаляет в очередь
     * Метод не возвращает значения
      * @param task
     */
    protected static void addTask(Task task) {

        tasks.offer(task);

    }

    /**
     * Метод не примает значения.
     *
     * @return задачи раставленые по приоритету.
     */
    protected static Task poolTask() {
        return tasks.poll();
    }

}
