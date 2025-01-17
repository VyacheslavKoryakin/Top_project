package HomeWork_57_58.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {


        List<String> fruits = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");

        List<String> newFruits = fruits.stream()
                .filter(f -> f.length() > 4)
                .sorted(Comparator.comparingInt(String::length))
                .map((f) -> f.toUpperCase())
                .toList();
        System.out.println(newFruits);
    }
}
