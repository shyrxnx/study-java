public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2015;
    double price = 30000;

    void drive() {
        System.out.println("You drove the car!");
    }

    void brake() {
        System.out.println("You stepped on the brake...");
    }

    public String toString() {
        return "Make: " + make + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Year: " + year + "\n" + "Price: " + price;
    }



}
