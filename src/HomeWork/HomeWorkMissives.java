package HomeWork;

import java.util.Arrays;

public class HomeWorkMissives {
    public static void main(String[] args) {

        // Задание 1
        getAverageValue();

       // Задание 2
        getMinMaxDoubleValue();

       //  Задание 3
        countVowels();

        // Задание 4
        getSnakeCase();

        // Задание 5
        getStrigMassive();


    }

    static void getAverageValue() {
        int[] numbers = {10, 13, 28, 1, 16, 83, 90};
        int sumValue = 0;

        for (int number : numbers) {
            sumValue += number;
        }
        System.out.println("Среднее значение чисел в массиве: " + sumValue / numbers.length);
        System.out.println("\n");
    }

    static void getMinMaxDoubleValue() {
        double[] numbers = {13.8, -1.2, 4.5, -76.4, 81.5, 11.1};
        double minValue = 0.0;
        double maxValue = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                minValue = numbers[i];
                maxValue = numbers[i];
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];

            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Минальное значение в массиве: " + minValue);
        System.out.println("Максимальное значение в массиве: " + maxValue);
        System.out.println("\n");
    }

    static void countVowels() {
        char[] vowelsLetter = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] symbols = {'O', 'I', '1', 'h', 'a', 'y', 'o', 'y', 'v', 'q', 'e', 'z', 'i'};
        int vowelsCounter = 0;
        for (char symbol : symbols) {
            for (char c : vowelsLetter) {
                if (symbol == c) {
                    vowelsCounter++;
                }
            }
        }
        System.out.println("Количество гласных букв в массиве: " + vowelsCounter);

        System.out.println("\n");
    }

    static void getSnakeCase() {
        String str = "to be or not to be";
        char[] symbols = str.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                symbols[i] = '_';
            }
            System.out.print(symbols[i]);
        }
        System.out.println("\n");
    }

    static void getStrigMassive() {
        String str = "one two three four five";
        String[] strMass = str.split(" ");
        System.out.println(Arrays.toString(strMass));
    }

}
