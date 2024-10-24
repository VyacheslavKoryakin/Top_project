package HomeWorkPolymorph.Object;

public class Dog extends Animal {


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
}
