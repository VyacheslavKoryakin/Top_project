package HomeWork;

import java.util.Scanner;

public class HomeWorkCycles {
    public static void main(String[] args) {
        // задание №1
        outputOddNumbers();

        // задание №2
        getProductNumber();


        //задание №3
        getMultiplicationTable();
    }


    static void outputOddNumbers() {
        System.out.println("Введите любое чило.");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        for (int i = 1; i <= digit; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    static void getProductNumber() {
        System.out.println("Введите любое чило.");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int product = 1;
        while (0 < digit) {
            product *= digit % 10;
            digit /= 10;
        }
        System.out.println(product);
    }


    static void getMultiplicationTable() {
        int result;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }
}