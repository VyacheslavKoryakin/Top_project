package HomeWorkPolymorph.Object;

public class Bird extends Animal {
    private boolean isFly;

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, boolean isFly) {
        super(name);
        this.isFly = isFly;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    @Override
    public void makeSound() {
        System.out.println("Птица " + getName() + " курлыкает");
    }

    @Override
    public void eat() {
        System.out.println("Птица " + getName() + " ест червячков");
    }

    /**
     * Метод проверят может ли птица летать
     * и выводит результат в консоль
      */
    public void getFly() {
        if (this.isFly) {
            System.out.println("Птица " + getName() + " умеет летать");
        } else {
            System.out.println("Птица " + getName() + " не умеет летать");
        }
    }
}
