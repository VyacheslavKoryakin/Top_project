package HomeWorkPolymorph.Object;

public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Кот " + getName() + " мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кот " + getName() + " ест мышей");
    }

    @Override
    public void move() {
        System.out.println("Кот " + getName() + " грациозно перемещается на мягких пушистых лапках");

    }

    @Override
    public void play() {
        System.out.println("Кот " + getName() + " кусает конечности человека, торчащие из под одеяла");

    }

    @Override
    public void beFrendly() {
        System.out.println("Кот " + getName() + " мурлычит");
    }
}
