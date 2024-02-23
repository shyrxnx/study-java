public class Main {
    public static void main(String[] args) {

        System.out.println("================ Using Getters ===============");
        System.out.println();
        Car car1 = new Car("Ford", "Ranger", 2022);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();
        System.out.println("================ Using Setters ===============");
        System.out.println();

        car1.setMake("Honda");
        car1.setModel("Civic");
        car1.setYear(2021);
        System.out.println(car1);

        System.out.println();
        System.out.println("================ Using Copy Method ===============");
        System.out.println();

        Car car2 = new Car("Toyota", "Raize", 2023);
        Car car3 = new Car("Rolls Royce", "Phantom", 2018);
        Car car4 = new Car(car2);

        car3.copy(car2);

        System.out.println(car2);
        System.out.println();
        System.out.println(car3);
        System.out.println();
        System.out.println(car4);

    }
}