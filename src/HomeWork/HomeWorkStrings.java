package HomeWork;

import java.util.Scanner;

public class HomeWorkStrings {
    public static void main(String[] args) {
        // задание 1:
        countSymbols();
        // задание 2:
        findSymbols();
        // задание 3
        findMiddleSymbols();


    }


    static void countSymbols() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи любые символы, любого количества и в любом регистре.");
        String text = sc.nextLine();
        int countLowerCaseLetters = 0;
        int countUpperCaseLetters = 0;
        int countDigitFromZeroToFour = 0;
        int countDigitFromFiveToNine = 0;
        int otherSymbols = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i))) {
                    countUpperCaseLetters++;
                } else {
                    countLowerCaseLetters++;
                }
            } else if (Character.isDigit(text.charAt(i))) {
                if (Integer.parseInt(Character.toString(text.charAt(i))) < 5) {
                    countDigitFromZeroToFour++;
                } else {
                    countDigitFromFiveToNine++;
                }
            } else {
                otherSymbols++;
            }
        }
        System.out.println("Букв в нижнем регистре: %s.\nБукв в верхнем регистре: %s.".formatted(countLowerCaseLetters, countUpperCaseLetters));
        System.out.println("Цифр от нуля до 4-х: %s.\nЦифр от 5 до 9: %s.".formatted(countDigitFromZeroToFour, countDigitFromFiveToNine));
        System.out.println("Других символов: %s.".formatted(otherSymbols));
        System.out.println("\n");
    }


    static void findSymbols() {

        String justText = "I learn Java!";
        System.out.println("Последний символ в строке: %s".formatted(justText.charAt(justText.length() - 1)));
        System.out.println("В конце строки находиться восклицательный знак?: %s".formatted(justText.endsWith("!")));
        System.out.println("Текст начинается на I learn? : %s".formatted(justText.startsWith("I learn")));
        System.out.println("Строка содержит слова Java?: %s".formatted(justText.substring(8, 12)));
        System.out.println("Заменить все буквы в строке с а на о: " + justText.replace('a', 'o'));
        System.out.println("Строка в верхнем регистре: " + justText.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + justText.toLowerCase());
        System.out.println("\n");
    }

    static void findMiddleSymbols() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с четным количеством символов.");
        String text = sc.nextLine();
        if (text.length() % 2 == 0) {
            System.out.println("Символы находящиеся в середине строки: " + text.substring((text.length() / 2 - 1), (text.length() / 2 + 1)));
        } else {
            System.out.println("Вы ввели строку с НЕчетным количеством символов.");
        }
        System.out.println("\n");
    }
}