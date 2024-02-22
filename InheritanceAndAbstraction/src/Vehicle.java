public abstract class Vehicle {

    String make;
    String model;
    int year;
    String color;

    Vehicle(String make, String model, int year, String color) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
    }

    public String toString() {
        return "Model: " + model + "\n" + "Make: " + make + "\n" + "Year: " + year + "\n" + "Color: " + color + "\n";
    }

}
