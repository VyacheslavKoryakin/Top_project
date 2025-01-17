package HomeWork_51_52;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyMutableClass myMutableClass = new MyMutableClass(99);
        MyMutableClass myMutableClass2 = new MyMutableClass(50);

        ImmutableClass immutableClass = new ImmutableClass("объект",List.of(1,2,3,4,5),myMutableClass);


        System.out.println(immutableClass);

        myMutableClass.setValue(myMutableClass2.getValue());
        myMutableClass.setValue(30);
        System.out.println(immutableClass.myMutableClass.getValue());

        Map<ImmutableClass, Integer> map = new HashMap<>();
        map.put(immutableClass, 20);
        System.out.println(map);
        System.out.println(immutableClass);

    }
}
