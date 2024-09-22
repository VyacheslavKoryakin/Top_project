package HomeWork;

public class HomeWorkStrings2 {
    public static void main(String[] args) {

        // Task 1 a)
          isPolindrome("Rotor");

        // Task 1 b)
          isPolindrome2("topot");

        // Task 1 c)
        isDigitsPolindrome(12221);

    }


    static void isPolindrome(String string) {
        String inputWordLowerCase = string.toLowerCase();
        String buildString = new StringBuilder(inputWordLowerCase).reverse().toString();

        if (inputWordLowerCase.equals(buildString)) {
            System.out.println("1-й метод полиндром");
        } else {
            System.out.println("1-й метод не полиндром");
        }
        System.out.println("\n");
    }

    static void isPolindrome2(String string) {
        String inputWordLowerCase = string.toLowerCase();
        String result = "";
        for (int i = 0; i < inputWordLowerCase.length() / 2; i++) {
            if (inputWordLowerCase.charAt(i) != inputWordLowerCase.charAt(inputWordLowerCase.length() - (i + 1))) {
                result = "2-й метод не является полиндромом";
            } else {
                result = "2-й метод полиндром";
            }
        }
        System.out.println(result);
        System.out.println("\n");
    }

    static void isDigitsPolindrome(int digits) {
        String strDigits = Integer.toString(digits);
        String buildString = new StringBuilder(strDigits).reverse().toString();
        String result = "";
        if (strDigits.equals(buildString)) {
            result = "3-й метод полондром";
        } else {
            result = "3-й метод не полондром";
        }
        System.out.println(result);

    }
}
