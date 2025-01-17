package HomeWork_51_52.Generics;

import HomeWork_59_60.Library;

public class Main {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>("строка");
        Box<Integer> intBox = new Box<>(100);

        System.out.println(intBox);
        intBox.setSomething(30);
        System.out.println(intBox);

        System.out.println(strBox);
        strBox.setSomething("новая строка");
        System.out.println(strBox);

        System.out.println(strBox.getSomething() + " " + intBox.getSomething());
        intBox.print();

        strBox.print();
        strBox.isEmpty();

        intBox.clear();
        intBox.isEmpty();
    }
}
