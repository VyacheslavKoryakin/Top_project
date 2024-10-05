package HomeWorkMethods;

public class Methods {
    /**
     * Метод для возведения целого числа в квадрат
     *
     * @param number int
     * @return number^2  -int
     */
    static int square(int number) {
        return number * number;
    }


    /**
     * Метод для создания полного имени.
     * Метод принимает две строки и соединяет их через пробел.
     *
     * @param firstName  String
     * @param secondName String
     * @return String
     */
    static String fullName(String firstName, String secondName) {
        return "Full name: " + firstName + " " + secondName;
    }

    /**
     * Метод принимает строки и
     * возвращает массивом самую длинную и самую короткую строки
     *
     * @param string String
     * @return array String
     */
    static String[] cornerValuesArray(String... string) {
        int maxStringLength = Integer.MIN_VALUE;
        int minStringLength = Integer.MAX_VALUE;
        String maxStringInArray = "";
        String minStringInArray = "";

        for (String s : string) {
            if (s.length() < minStringLength) {
                minStringLength = s.length();
                minStringInArray = s;
            }
            if (s.length() > maxStringLength) {
                maxStringLength = s.length();
                maxStringInArray = s;
            }
        }

        String[] resultArray = {maxStringInArray, minStringInArray};
        return resultArray;

    }

    /**
     * Метод принимает целые числа и
     * возвращает массивом наибольшее и наименьшее числа
     *
     * @param number int
     * @return array int
     */
    static int[] cornerValuesArray(int... number) {
        int maxIntValue = Integer.MIN_VALUE;
        int minIntValue = Integer.MAX_VALUE;

        for (int i : number) {
            if (i < minIntValue) {
                minIntValue = i;
            }
            if (i > maxIntValue) {
                maxIntValue = i;
            }
        }

        int[] resultArray = {maxIntValue, minIntValue};
        return resultArray;


    }

    /**
     * Метод принимает символы и
     * возвращает массивом наибольший и наименьший символы
     *
     * @param symbol int
     * @return array int
     */ static char[] cornerValuesArray(char... symbol) {
        int maxCharValue = Integer.MIN_VALUE;
        int minCharValue = Integer.MAX_VALUE;
        char maxCharInArray = 0;
        char minCharInArray = 0;

        for (char c : symbol) {
            if (c < minCharValue) {
                minCharValue = c;
                minCharInArray = c;

            }
            if (c > maxCharValue) {
                maxCharValue = c;
                maxCharInArray = c;
            }
        }

        char[] resultArray = {maxCharInArray, minCharInArray};
        return resultArray;

    }
}
