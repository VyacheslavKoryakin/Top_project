package HomeWorkDoubleArrays;

import java.util.Arrays;

public class Methods {

    /**
     * Метод заполняет двумерный целочисленный массив.
     * Метод принимает двумерный целочисленный массив
     *
     * @param array int[][]
     */
    static void fillArray(int[][] array) {
        int fillValue = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                array[i][j] = fillValue;
                fillValue++;
                print(array[i][j]);
            }
        }

    }

    /**
     * Метод для вывода в консоль.
     * Метод принимает двумерный целочисленный массив
     * и вывод его в консоль
     *
     * @param array int[][]
     */
    static void print(int array) {
        System.out.print(array);

    }


    /**
     * Метод считает сумму всех строк двумерного целочисленного массива.
     * Метод принимает двумерный целочисленный массив.
     *
     * @param array int[][]
     */
    static void sumLine(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
            }
            printSum("Сумма строки ", i + 1, sum);

        }
    }

    /**
     * Метод считает сумму всех столбцов двумерного целочисленного массива.
     * Метод принимает двумерный целочисленный массив.
     *
     * @param array int[][]
     */
    static void sumColumn(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[j][i];
            }
            printSum("Сумма столбца ", i + 1, sum);

        }
    }

    /**
     * Метод для вывода в консоль.
     * Метод принимает  три парраметра
     * и выводит их значения в консоль.
     *
     * @param title  String
     * @param number int
     * @param sum    int
     */
    static void printSum(String title, int number, int sum) {
        System.out.println(title + number + ": " + sum);
    }

    /** Метод работает с копией ссылки на принятый массив.
     * Метод принимат одномерный строковый массив
     *
     * @param array String[]
     * @return String[]
     */
    static String[] workWithCopiedArray(String[] array) {
        array = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = "this is copy";

        }
        return array;
    }

    /** Метод работает с оригинальной ссылкой принятого массива.
     * Метод принимат одномерный строковый массив
     *
     * @param array String[]
     * @return String[]
     */static String[] workWithOriginArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "new array";
        }
        return array;
    }
}