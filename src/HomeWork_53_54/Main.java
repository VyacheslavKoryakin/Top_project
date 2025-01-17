package HomeWork_53_54;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        SetClass setClass = new SetClass();

        int[] numbers = {1, 2, 3, 5, 5, 3, 2, 1, 4};

        System.out.println(setClass.getUniqueElements(numbers));


        String[] words = {"apple", "banana", "apple", "cherry", "banana"};


        System.out.println(setClass.getOrderedUniqueElements(words));


        int[] newNumbers = {10, 20, 30, 40, 50};
        int target = 35;
        int[] result = setClass.findClosestNumbers(newNumbers, target);
        System.out.println(Arrays.toString(result));
    }


}

