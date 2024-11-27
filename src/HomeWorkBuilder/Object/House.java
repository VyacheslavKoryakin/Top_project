package HomeWorkBuilder.Object;

import java.util.Objects;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        House house = (House) object;
        return garage == house.garage && Objects.equals(floor, house.floor) && Objects.equals(room, house.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, room, garage);
    }
}
