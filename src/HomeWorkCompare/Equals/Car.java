package HomeWorkCompare.Equals;

import java.util.Objects;

public class Car extends Transport implements Comparable<Car>{
    int wheels;

    public Car(String model, int year, int wheels) {
        super.model = model;
        super.year = year;
        this.wheels = wheels;

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return Objects.equals(super.model, car.model) && super.year == car.year && wheels == car.wheels ;
    }

    @Override
    public String toString() {
        return  "model='" + super.model  +", year=" + super.year + ", wheels=" + wheels ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model,year,wheels);

    }

    @Override
    public int compareTo(Car o) {
       if(super.model.compareTo(o.model)==0){
           if(Integer.compare(super.year,o.year)==0){
               return Integer.compare(this.wheels, wheels);
           }else{
               return Integer.compare(super.year,o.year);
           }
       }else{
           return super.model.compareTo(o.model);
       }
    }
}
