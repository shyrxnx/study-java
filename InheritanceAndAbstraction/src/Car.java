public class Car extends Vehicle {

    int doors;

    Car (String model, String make, int year, String color, int doors) {
        super(model, make, year, color);
        this.doors = doors;
    }

    public String toString() {
        return super.toString() + "Doors: " + doors;
    }

}
