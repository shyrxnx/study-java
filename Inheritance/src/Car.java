public class Car extends Vehicle {
    int wheels;

    Car(String model, double speed, int wheels) {
        super(model, speed);
        this.wheels = wheels;
    }

    @Override
    void drive() {
        System.out.println("You drove the car...");
    }

    public String toString() {
        return "Model: " + model + "\n" + "Speed: " + speed + "\n" + "No. of wheels: " + wheels;
    }

}
