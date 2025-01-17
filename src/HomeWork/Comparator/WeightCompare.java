package HomeWork.Comparator;

import java.util.Comparator;
import java.util.Objects;

public class WeightCompare implements Comparator<HighWeight> {
HighWeight weight;

    public WeightCompare() {

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        WeightCompare that = (WeightCompare) object;
        return Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weight);
    }

    @Override
    public int compare(HighWeight o1, HighWeight o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
