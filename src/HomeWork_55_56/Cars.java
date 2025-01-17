package HomeWork_55_56;


import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private static int i;
    private String model;
    private String type;
    private int year;


    public Cars(String model, String type, int year) {
        this.type = type;
        this.model = model;
        this.year = year;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Cars cars = (Cars) object;
        return year == cars.year && Objects.equals(model, cars.model) && Objects.equals(type, cars.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, year);
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year;

    }

    public Cars getCar(String model, List<Cars> cars) {
        for (Cars car : cars) {
            if (model.equals(car.getModel())) {
                return car;
            }
        }
        throw new CarNotFountException("такая машина не найдена");
    }
}







