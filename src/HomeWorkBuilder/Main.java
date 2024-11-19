package HomeWorkBuilder;

import HomeWorkBuilder.Object.House;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .floor(2)
                .room(5)
                .garage(true)
                .builder();
        System.out.println("Характеристики дома №1 : " + house1);

        House house2 = new House.Builder()
                .floor(1)
                .room(3)
                .garage(false)
                .builder();

        System.out.println("Характеристики дома №2 : " + house2);

        House house3 = new House.Builder()
                .floor(4)
                .room(5)
                .garage(true)
                .builder();
        System.out.println("Характеристики дома №3 : " + house3);

        House house4 = new House.Builder()
                .floor(1)
                .room(3)
                .garage(false)
                .builder();

        System.out.println("Характеристики дома №4 : " + house4);

        System.out.println();

        List<House>houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        System.out.println(houses);
        System.out.println(houses.contains(house1));
        System.out.println(houses.contains(house2));

        System.out.println();

        System.out.println(houses.indexOf(house3));
        System.out.println(houses.indexOf(house4));

        System.out.println();

        System.out.println(house3.equals(house1));
        System.out.println(house4.equals(house2));

        System.out.println();

        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());
        System.out.println(house4.hashCode());

        System.out.println(houses.size());

    }
}
