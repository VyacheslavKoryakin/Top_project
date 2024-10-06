package HomeWorkMethods;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.SocketHandler;

import static HomeWorkMethods.Methods.getFactorial;

public class Main {
    public static void main(String[] args) {
//        // Задание 1
//        Random random = new Random();
//        int number = random.nextInt(-100, 100);
//
//        int square = Methods.square(number);
//        System.out.println(square);
//
//        System.out.println("\n");
//
//        //Задание 2
//        String firstName = "Ivan";
//        String secondName = "Petrov";
//        System.out.println(Methods.fullName(firstName, secondName));
//
//        System.out.println("\n");
//
//        //Задание 3
//        String string2 = "это длинная строка";
//        System.out.println(Arrays.toString(Methods.cornerValuesArray("some string", string2, "n", "2134", "java")));
//
//        System.out.println("\n");
//
//        //Проверка с одной строкой в массиве
//        String[] string3 = {"это длинная строка"};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(string3)));
//
//        System.out.println("\n");
//
//        //Проверка с одной множеством строк в массиве
//        string3 = new String[]{"Java", "digit 10", " ", ""};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(string3)));
//
//        System.out.println("\n");
//
//        //Проверка с пустой строкой в массиве
//        string3 = new String[]{};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(string3)));
//
//        System.out.println("\n");
//
//        int number2 = 12;
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(1, 17, number2, -9, 88)));
//
//        System.out.println("\n");
//
//        //Проверка с пустым массивом
//        int[] number3 = {};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(number3)));
//
//        System.out.println("\n");
//
//        // Проверка с массивом из положительных целых чисел
//        number3 = new int[]{12, 17, 100};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(number3)));
//
//        System.out.println("\n");
//
//        // Проверка с массивом из отрицательных целых чисел
//        number3 = new int[]{-11, -7, -130};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(number3)));
//        System.out.println("\n");
//
//        char symbol = 'a';
//        System.out.println(Arrays.toString(Methods.cornerValuesArray('g', 'S', '1', 'J', symbol, 'b')));
//
//        System.out.println("\n");
//
//
//        // проверка метода с одним элементом типа char  в массиве.
//        char[] symbols = {'1'};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(symbols)));
//
//        System.out.println("\n");
//
//        // проверка метода с пустым массивом
//        symbols = new char[]{};
//        System.out.println(Arrays.toString(Methods.cornerValuesArray(symbols)));

        System.out.println("\n");


        long numberForFactorial = 5;
        System.out.println(getFactorial(numberForFactorial));
    }


}
