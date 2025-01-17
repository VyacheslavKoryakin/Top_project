package HomeWork_51_52;

import java.util.List;
import java.util.Objects;

public class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    MyMutableClass myMutableClass;

    public ImmutableClass(String name, List<Integer> numbers, MyMutableClass myMutableClass) {
        this.name = name;
        this.numbers = numbers;
        this.myMutableClass = new MyMutableClass(myMutableClass);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public MyMutableClass getMyMutableClass() {
        return myMutableClass;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ImmutableClass that = (ImmutableClass) object;
        return Objects.equals(name, that.name) && Objects.equals(numbers, that.numbers) && Objects.equals(myMutableClass, that.myMutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, myMutableClass);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                ", myMutableClass=" + myMutableClass +
                '}';
    }
}
