package HomeWorkPolymorph.Object;

public class Dog extends Animal implements Pet {


    public Dog(String name) {

        super(name);
    }

    public void makeSound() {
        System.out.println("Собака " + getName() + " гавкает");

    }

    @Override
    public void eat() {
        System.out.println("Собака " + getName() + " грызет кости");
        ;
    }

    @Override
    public void move() {
        System.out.println("Собака " + getName() + " бегает на 4-х лапах");

    }

    @Override
    public void play() {
        System.out.println("Собака " + getName() + " может играть с мячем");

    }

    @Override
    public void beFrendly() {
        System.out.println("Собака " + getName() + " виляет хвостом");
    }
}
