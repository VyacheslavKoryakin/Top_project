package HomeWorkPolymorph.Object;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Метод не принимает значений.
     * Метод вывод в консоль звук животного.
     */
    public void makeSound() {

    }

    /**
     * Метод вывод в консоль информацию
     * чем питается животное
     */
    public void eat() {

    }
}
