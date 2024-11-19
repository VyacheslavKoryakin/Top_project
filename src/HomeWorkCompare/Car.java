package HomeWorkCompare;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "model='" + model + ", year=" + year + ", color='" + color;
    }

    @Override
    public int compareTo(Car car) {

        if (model.compareTo(car.model) == 0) {
            if (Integer.compare(this.year, car.year) == 0) {
                return color.compareTo(car.color);
            } else {
                return Integer.compare(car.year, this.year);
            }
        } else {

            return model.compareTo(car.model);
        }

    }

}


