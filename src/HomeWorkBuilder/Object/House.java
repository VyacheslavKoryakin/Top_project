package HomeWorkBuilder.Object;

public class House {
    private Integer floor;
    private Integer room;
    private boolean garage;

    public House(Builder builder) {
        this.floor = builder.floor;
        this.garage = builder.garage;
        this.room = builder.room;
    }
    @Override
    public String toString() {
        return
                "этажей = " + floor +
                ", комнат = " + room +
                ", гараж = " + garage;
    }

    public static class Builder {
        private Integer floor;
        private Integer room;
        private boolean garage;


        public Builder() {

        }

        public Builder floor(Integer floor) {
            this.floor = floor;
            return this;
        }

        public Builder room(Integer room) {
            this.room = room;
            return this;
        }

        public Builder garage(boolean garage) {
            this.garage = garage;
            return this;
        }


        public House builder() {
            return new House(this);
        }

    }
}
