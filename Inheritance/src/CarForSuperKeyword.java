public class CarForSuperKeyword extends Vehicle{
    int wheels;
    int year;

    CarForSuperKeyword(String model, double speed, int wheels, int year) {
        super(model, speed);
        this.wheels = wheels;
        this.year = year;
    }

    public String toString() {
        return "Model: " + model + "\n" + "Speed: " + speed + "\n" + "No. of wheels: " + wheels + "\n" + "Year: " + year;
    }
}
