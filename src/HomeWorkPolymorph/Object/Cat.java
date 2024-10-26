package HomeWorkPolymorph.Object;

public class Cat extends Animal {

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
}
