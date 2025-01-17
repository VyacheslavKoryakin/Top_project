package HomeWork_51_52;

import java.util.List;
import java.util.Objects;

public class MyMutableClass {
    private int value;

    public MyMutableClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyMutableClass that = (MyMutableClass) object;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyMutableClass{" +
                "value=" + value +
                '}';
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyMutableClass(MyMutableClass newValue) {
        this.value = newValue.value;
    }
}
