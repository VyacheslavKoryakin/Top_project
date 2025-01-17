package HomeWork_57_58.ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Егор");
        names.add("Михаил");
        names.add("Яков");
        names.add("Арсений");
        names.add("Борис");
        names.add("Антон");

       names.sort(Comparator.reverseOrder());
        System.out.println(names);

        Collections.sort(names.reversed());
        System.out.println(names);

    }

      Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 != null && o2 != null) {
                    return o2.compareTo(o1);
                }else{
                    return 0;
                }
            }

        };



}
