package HomeWork_55_56;

public class Exception {
    public static void main(String[] args) {

        try {
            System.out.println(deviation(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя " + e);
        }

    }

    public static int deviation(int x, int y) {
        return x / y;
    }
}
