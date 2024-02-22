public class Vehicle {

    String model;
    double speed;

    void drive() {
        System.out.println("You are driving the vehicle");
    }

    void stop() {
        System.out.println("You stopped the vehicle");
    }

    Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

}
