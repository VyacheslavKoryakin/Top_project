package HomeWorkQueue;

import java.util.Comparator;

import static java.lang.Integer.compare;

public class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private String category;

    public Task(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public int compareTo(Task o) {
        if (Integer.toString(priority).compareTo(Integer.toString(o.priority)) != 0) {
            return Integer.compare(priority, o.priority);
        } else {
            return category.compareTo(o.category);


        }
    }

    @Override
    public String toString() {
        return name + ", priority=" + priority +
                ", category='" + category;
    }


}
