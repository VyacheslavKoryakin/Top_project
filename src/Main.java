import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
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


