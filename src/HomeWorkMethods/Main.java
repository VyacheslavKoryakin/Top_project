package HomeWorkMethods;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Random random = new Random();
        int number = random.nextInt(-100, 100);

        int square = Methods.square(number);
        System.out.println(square);

        System.out.println("\n");

        //Задание 2
        String firstName = "Ivan";
        String secondName = "Petrov";
        System.out.println(Methods.fullName(firstName, secondName));

        System.out.println("\n");

        //Задание 3
        String string2 = "это длинная строка";
        System.out.println(Arrays.toString(Methods.cornerValuesArray("some string", string2, "n", "2134", "java")));

        System.out.println("\n");


        int number2 = 12;
        System.out.println(Arrays.toString(Methods.cornerValuesArray(1, 17, number2, -9, 88)));


        System.out.println("\n");


        char symbol = 'a';
        System.out.println(Arrays.toString(Methods.cornerValuesArray('g', 'S', '1', 'J', symbol, 'b')));
    }
}
