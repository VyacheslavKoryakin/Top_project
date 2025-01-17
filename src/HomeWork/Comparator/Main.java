package HomeWork.Comparator;

import java.util.*;

public class Main {
    HighCompare highCompare;
    WeightCompare weightCompare;
    public static void main(String[] args) {
        HighWeight highWeight1 = new HighWeight(10, 25);
        HighWeight highWeight2 = new HighWeight(1, 8);
        HighWeight highWeight3 = new HighWeight(400, 400);
        HighWeight highWeight4 = new HighWeight(1, 25);

        List<HighWeight> list = new ArrayList<>();
        list.add(highWeight1);
        list.add(highWeight2);
        list.add(highWeight3);
        list.add(highWeight4);

        list.sort(new WeightCompare());
        System.out.println(list);

        list.sort(new HighCompare());
        System.out.println(list);

    }

}


