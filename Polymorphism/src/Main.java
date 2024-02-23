public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Motorcycle motor1 = new Motorcycle();
        Van van1 = new Van();

        Vehicle[] racers = {
                car1,
                motor1,
                van1
        };

        for (Vehicle i : racers) {
            i.move();
        }

    }
}