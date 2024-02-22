public class Motorcycle extends Vehicle {

    String type;

    Motorcycle (String model, String make, int year, String color, String type) {
        super(model, make, year, color);
        this.type = type;
    }

    public String toString() {
        return super.toString() + "Type: " + type;
    }

}
