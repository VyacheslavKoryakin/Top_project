package HomeWorkCompare.Equals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Suzuki",2014, 3);
        Car car2 = new Car("Renault",2018, 4);
        Car car3 = new Car("Suzuki",2011, 4);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);


        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
        System.out.println(car1.equals(car3));

        Collections.sort(cars);
        System.out.println(cars);
        cars.forEach(car-> System.out.println(car));

    }
}
