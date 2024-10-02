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
        String[] strArray = {"some string", " ", "2134", "java", ""};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(strArray)));


    }
}
