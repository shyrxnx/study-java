public class Main {
    public static void main(String[] args) {

        Car newCar = new Car("Ford", "Everest", 2017, "Black", 4);
        Motorcycle newMotorcycle = new Motorcycle("Kawasaki", "Ninja", 2019, "Red", "Sports Bike");
        Trucks newTruck = new Trucks("Volvo", "FMX", 2021, "Blue", "36×75");

        System.out.println("================ Car ===============");
        System.out.println(newCar);

        System.out.println();
        System.out.println("================ Motorcycle ===============");
        System.out.println(newMotorcycle);

        System.out.println();
        System.out.println("================ Truck ===============");
        System.out.println(newTruck);

    }
}