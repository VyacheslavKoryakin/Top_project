package HomeWork.ArrayLinkedList;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lists {
    static Random random = new Random();

    static final Integer ITERATOR_VALUE = 1000_000;

    public static void main(String[] args) {


        List<Integer> arrayInt = new ArrayList<>();
        List<Integer> linkedInt = new LinkedList<>();


        System.out.println("Заполнение ArrayList : " + fillList(arrayInt) + " ms");
        System.out.println("Заполнение LinkedList : " + fillList(linkedInt) + " ms");

        System.out.println("Получение 1000000 элементов из ArrayList :" + takeRandomValue(arrayInt) + " ms");
        System.out.println("Получение 1000000 элементов из LinkedList :" + takeRandomValue(linkedInt) + " ms");


    }

    public static long fillList(List list) {
        LocalTime startTime = LocalTime.now();
        for (int i = 0; i <= ITERATOR_VALUE; i++)
            list.add(i);
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        return duration;
    }

    public static long takeRandomValue(List list) {
        LocalTime startTime = LocalTime.now();
        for (int i = 0; i <= ITERATOR_VALUE; i++) {
            int index = random.nextInt(0, ITERATOR_VALUE + 1);
            list.get(index);
        }
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        return duration;
    }
}
