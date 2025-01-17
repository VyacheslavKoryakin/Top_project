package HomeWork_51_52.Generics;

public class Box<T> {
    private T something;

    public Box(T something) {
        this.something = something;
    }

    public T getSomething() {
        return something;
    }

    public void setSomething(T something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "Box{" +
                "something=" + something +
                '}';
    }

    public void print() {
        System.out.println(something + " Это что то распечаталось");

    }

    public void isEmpty() {
        if (something == null) {
            System.out.println("В коробке пусто");
        } else {
            System.out.println("В коробке что то есть ");
        }
    }

    public void clear() {
        something = null;
        System.out.println("Коробка очищена");
    }
}
