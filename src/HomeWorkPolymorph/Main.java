package HomeWorkPolymorph;

import HomeWorkPolymorph.Object.Animal;
import HomeWorkPolymorph.Object.Bird;
import HomeWorkPolymorph.Object.Cat;
import HomeWorkPolymorph.Object.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Бобик");
        dog1.makeSound();
        dog1.eat();

        System.out.println();

        Dog dog2 = new Dog("Рэкс");
        dog2.makeSound();
        dog2.eat();

        System.out.println();

        Animal cat1 = new Cat("Мурзик");
        cat1.makeSound();
        cat1.eat();

        System.out.println();

        Cat cat2 = new Cat("Барсик");
        cat2.makeSound();
        cat2.eat();

        System.out.println();

        Animal bird1 = new Bird("Кеша");
        bird1.makeSound();
        bird1.eat();

        System.out.println();

        Bird bird2 = new Bird("Птах", true);
        bird2.makeSound();
        bird2.eat();
        bird2.getFly();

        System.out.println();

        Animal[] animals = new Animal[]{dog1, dog2, cat1, cat2, bird1, bird2};

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            System.out.println();

        }

    }


}
