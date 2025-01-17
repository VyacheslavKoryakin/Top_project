package HomeWork_53_54;

import java.util.*;

public class SetClass {
    public Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : numbers) {
            uniqueNumbers.add(number);
        }
        return uniqueNumbers;
    }

    public Set<String> getOrderedUniqueElements(String[] words) {
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        return uniqueWords;
    }

    public int [] findClosestNumbers(int[] numbers, int target){

            NavigableSet<Integer> closNumber = new TreeSet<>();

            for (int number : numbers) {
                closNumber.add(number);
            }
            Integer minNumber = closNumber.lower(target);
            Integer maxNumber = closNumber.higher(target);

            if (minNumber == null || maxNumber == null) {
                return new int[]{};
            }
        return new int[]{minNumber, maxNumber};
    }
}

