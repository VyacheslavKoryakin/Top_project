package HomeWorkDoubleArrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание1
        int[][] intArray = new int[3][3];

        Methods.fillArray(intArray);

        System.out.println("\n");

        Methods.sumLine(intArray);

        System.out.println("\n");

        Methods.sumColumn(intArray);

        System.out.println("\n");

        // Задание2
        String[] array = {"этот", "массив", "оригинальный"};

        System.out.println("Массив до метода " + Arrays.toString(array));
        System.out.println("Массив в методе " + Arrays.toString(Methods.workWithCopiedArray(array)));
        System.out.println("Массив после метода " + Arrays.toString(array));

        System.out.println("\n");

        System.out.println("Массив до метода " + Arrays.toString(array));
        System.out.println("Массив в метода " + Arrays.toString(Methods.workWithOriginArray(array)));
        System.out.println("Массив после метода " + Arrays.toString(array));
    }
}
