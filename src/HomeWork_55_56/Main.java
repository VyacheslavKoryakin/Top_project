package HomeWork_55_56;

import HomeWorkCompare.Car;

import java.util.ArrayList;
import java.util.List;




public class Main {
   private static Cars car;
    public static void main(String[] args) {
        Cars car1 = new Cars("opel", "sedan", 2008);
        Cars car2 = new Cars("mazda", "sedan", 2011);
        Cars car3 = new Cars("audi", "lift back", 2009);
        Cars car4 = new Cars("vaz", "crossover", 2023);


        List<Cars> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        try {
        for (Cars car : cars) {
            System.out.println(car.getCar("nissan", cars));
            break;
        }
        }catch (CarNotFountException e){
            System.out.println(e.getMessage());
        }
    }
}



