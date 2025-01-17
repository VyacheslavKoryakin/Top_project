package HomeWork.Comparator;

public class HighWeight {
    private Integer high;
    private Integer weight;
    HighCompare highCompare;
    WeightCompare weightCompare;

    public HighWeight(int high, int weight) {
        this.high = high;
        this.weight = weight;
    }


    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "high=" + high +
                ", weight=" + weight +
                '}';
    }
}
