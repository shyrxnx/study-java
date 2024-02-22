public class Trucks extends Vehicle {
    String bedSize;

    Trucks (String model, String make, int year, String color, String bedSize) {
        super(model, make, year, color);
        this.bedSize = bedSize;
    }

    public String toString() {
        return super.toString() + "Bed Size: " + bedSize;
    }
}
