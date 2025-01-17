package HomeWork.Map;

import ClassWork.JCF.Collection.Comparators.TreeMapComparator;

import java.util.*;

public class MapInverse  {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "C");
        map.put(2, "B");
        map.put(3, "A");
        System.out.println(map);
        System.out.println(inerseMap(map));

    }

    public static LinkedHashMap<String, Integer> inerseMap(LinkedHashMap<Integer, String> map) {
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>() ;

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            map2.put(m.getValue(), m.getKey());
        }
        return map2;
    }




}

