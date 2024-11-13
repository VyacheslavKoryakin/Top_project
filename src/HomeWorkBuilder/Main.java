package HomeWorkBuilder;

import HomeWorkBuilder.Object.House;

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

    }
}
