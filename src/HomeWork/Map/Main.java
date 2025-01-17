package HomeWork.Map;

import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        boolean hasLetter = false;
        double averageLetter = 0;
        String str = "java is fun and java is powerful";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            map.put(symbol, map.getOrDefault(symbol, 0) + 1);
        }
        System.out.println(map);
        System.out.println(hasSingleLetter(map, hasLetter));
        System.out.println(getAverageLetter(map, averageLetter));

        System.out.println();

        Map<String, Integer> map2 = new TreeMap<>();


        String string = "!!! Java is Fun and java IS powerful !!!";
        String[] separatedWords = string.split(" ");
        for (int i = 0; i < separatedWords.length; i++) {

        }
        for (String separatedWord : separatedWords) {
            for (int i = 0; i < 1; i++) {
                if (Character.isLetter(separatedWord.charAt(i))) {
                    String word = separatedWord.toLowerCase();
                    map2.put(word, map2.getOrDefault(word, 0) + 1);

                }
            }
        }
        System.out.println(map2);

    }

    public static boolean hasSingleLetter(Map<Character, Integer> map, boolean hasLetter) {
        for (Integer value : map.values()) {
            if (value == 1) {
                hasLetter = true;
            } else {
                hasLetter = false;
            }

        }
        return hasLetter;
    }

    public static double getAverageLetter(Map<Character, Integer> map, double averageLetter) {
        for (Integer value : map.values()) {
            averageLetter += value;
        }
        return averageLetter / map.size();
    }


}

