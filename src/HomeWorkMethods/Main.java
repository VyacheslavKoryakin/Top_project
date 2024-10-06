package HomeWorkMethods;

import java.util.Arrays;
import java.util.Random;

import static HomeWorkMethods.Methods.getFactorial;

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

        // Проверка метода с использованием массива из одного элемента
        String[] string3 = {"Новая строка"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(string3)));

        System.out.println("\n");

        // Проверка метода с использованием массива
        string3 = new String[]{"строка", "Джава", " "};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(string3)));

        System.out.println("\n");

        // Проверка метода с использованием пустого массива
        string3 = new String[]{};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(string3)));

        System.out.println("\n");


        int number2 = 12;
        System.out.println(Arrays.toString(Methods.cornerValuesArray(1, 17, number2, -9, 88)));


        System.out.println("\n");

        // Проверка метода с испольванием массива с положительными числами
        int[] number3 = {12, 18, 1, 2, 3, 100};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(number3)));


        System.out.println("\n");


        // Проверка метода с испольванием массива с положительными числами
        number3 = new int[]{-1, -18, -21, -2, -43, -100};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(number3)));


        System.out.println("\n");

        // Проверка метода с испольванием пустого массива
        number3 = new int[]{};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(number3)));


        System.out.println("\n");

        char symbol = 'a';
        System.out.println(Arrays.toString(Methods.cornerValuesArray('g', 'S', '1', 'J', symbol, 'b')));

        System.out.println("\n");

        // Проверка метода с использованием массива с одним элементом
        char[] symbol2 = {'B'};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(symbol2)));

        System.out.println("\n");

        // Проверка метода с использованием массива
        symbol2 = new char[]{'B', '1', 'k'};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(symbol2)));

        System.out.println("\n");

        // Проверка метода с использованием пустого массива
        symbol2 = new char[]{};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(symbol2)));

        System.out.println("\n");


        int numberForFactorial = 4;
        System.out.println(getFactorial(numberForFactorial));
    }
}
