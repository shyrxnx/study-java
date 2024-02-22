public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", 2000, 4);
        Car car3 = new Car("Civic", 2300, 4);
        car1.stop();
        System.out.println(car1.wheels);

        System.out.println();
        System.out.println("================ Using toString Method and Super Keyword ===============");

        System.out.println(car3);

        Motorcycle motor1 = new Motorcycle("Yamaha", 1300, 2);
        motor1.drive();

        System.out.println();
        System.out.println("================ Using toString Method and Super Keyword ===============");

        CarForSuperKeyword car2 = new CarForSuperKeyword("Mustang", 3500, 4, 2017);
        System.out.println(car2);
    }
}