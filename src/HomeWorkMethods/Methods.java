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

    /** Метод принимает массив строк и
     *  возвращает массивом самую длинную и самую короткую строки
      * @param array String
     * @return array String
     */
    static String[] cornerValuesArray(String[] array) {
        int maxStringLength = Integer.MIN_VALUE;
        int minStringLength = Integer.MAX_VALUE;
        String maxStringInArray = "";
        String minStringInArray = "";

        for (String s : array) {
            if (s.length() < minStringLength) {
                minStringLength=s.length();
                minStringInArray = s;
            }
            if (s.length() > maxStringLength) {
                maxStringLength=s.length();
                maxStringInArray = s;
            }
        }

        String[] resultArray = {maxStringInArray, minStringInArray};
        return resultArray;

    }
}
