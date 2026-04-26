package lo.zee.prototype_pattern;

public class Bus extends Vehicle {

    private Integer numberOfSeats;

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats='" + numberOfSeats + '\'' +
                '}';
    }
}
