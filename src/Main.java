

import java.util.*;


public class Main {
    static final String FINISH_LESSON = "Finish lesson";
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Введите общее количество отзывов!");
        int allFeedbackCount = sc.nextInt();

        System.out.println("Введите количество хороших отзывов!");
        int goodFeedbackCount = sc.nextInt();

        int badFeedbackCount = allFeedbackCount - goodFeedbackCount ;

        double goodFeedbackPercent = (goodFeedbackCount * 100.0 / allFeedbackCount);
        double badFeedbackPercent = (badFeedbackCount * 100.0 / allFeedbackCount);
        int goodFeedbackPercentInt = (int) Math.round(goodFeedbackPercent);
        int badFeedbackPercentInt = (int) Math.round(badFeedbackPercent);
        System.out.println("Всего отзывов - " + allFeedbackCount +
                "\nХороших отзывов (double) - " + goodFeedbackPercent + "%" +
                "\nПлохих отзывов (double) - " + badFeedbackPercent + "%" +
                "\nХороших отзывов (int) - " + goodFeedbackPercentInt + "%" +
                "\nПлохих отзывов (int) - " + badFeedbackPercentInt + "%");
        System.out.println("\n\n");




        int myInt = 130;
        byte myByte = (byte) myInt;
        System.out.println("byte " + myByte);
        System.out.println("\n\n");


        int a = 10;

        System.out.println(a++);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println("\n\n");


        System.out.println("Константа- " + FINISH_LESSON);
        System.out.println("\n\n");




        Random random = new Random();

        char randCharVal1 = (char) random.nextInt(65, 100);
        char randCharVal2 = (char) random.nextInt(65, 100);
        char randCharVal3 = (char) random.nextInt(65, 100);
        char randCharVal4 = (char) random.nextInt(65, 100);

        System.out.print("Слово полученное из рандомных символов- ");
        System.out.print(randCharVal1);
        System.out.print(randCharVal2);
        System.out.print(randCharVal3);
        System.out.print(randCharVal4);
        System.out.println("\n\n");




        long longVal = 2_560_483_649L;
        int intVal = (int) longVal;
        System.out.println("Значение переполненой переменной intVal = " + intVal);





        byte myByte = 10;
        short myShort = 10;
        int myInt = 45;
        long myLong = 15L;
        float myFloat = 3.07f;
        double myDouble = 3.07;
        char myChar = 'b';
        boolean myBoolean = true;

        int myInt2 = 13;

        int sum = myInt + myInt2;
        System.out.println("Сложение: " + sum);

        int difference = myInt - myInt2;
        System.out.println("Вычитание: " + difference);

        int product = myInt * myInt2;
        System.out.println("Умножение: " + product);

        int quotient = myInt / myInt2;
        System.out.println("Деление: " + quotient);

        int remainder = myInt % myInt2;
        System.out.println("Остаток от деления: " + remainder);


    }
}


