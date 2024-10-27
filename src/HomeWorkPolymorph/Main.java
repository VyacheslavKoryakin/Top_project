package HomeWorkPolymorph;

import HomeWorkPolymorph.Object.*;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Бобик");


        Dog dog2 = new Dog("Рэкс");


        Animal cat1 = new Cat("Мурзик");


        Cat cat2 = new Cat("Барсик");


        Animal bird1 = new Bird("Кеша", false);


        Bird bird2 = new Bird("Птах", true);


        Animal[] animals = new Animal[]{dog1, dog2, cat1, cat2, bird1, bird2};

        for (Animal animal : animals) {
            if (animal instanceof Pet) {
                ((Pet) animal).play();
                ((Pet) animal).beFrendly();
            }
            animal.makeSound();
            animal.eat();
            animal.move();

            System.out.println();

        }

    }


}
