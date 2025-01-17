package HomeWork.Comparator;

import java.util.Comparator;
import java.util.Objects;


public class HighCompare implements Comparator<HighWeight> {
HighWeight high;

    public HighCompare() {

    }

    @Override
    public int compare(HighWeight o1, HighWeight o2) {
        return Integer.compare(o1.getHigh(), o2.getHigh());
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        HighCompare that = (HighCompare) object;
        return Objects.equals(high, that.high);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(high);
    }
}



