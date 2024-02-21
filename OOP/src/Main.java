public class Main {
    public static void main(String[] args) {

        Car firstCar = new Car();

        System.out.println(firstCar.make);
        System.out.println(firstCar.model);
        System.out.println(firstCar.color);
        System.out.println(firstCar.year);
        System.out.println(firstCar.price);

        System.out.println("================ Using toString Method ===============");
        System.out.println(firstCar);


        //Call the method of the object
        firstCar.drive();


        System.out.println("================ Using constructors ===============");

        Human firstHuman = new Human("Sheena", 16, "Asian", "Brown", 165f);
        Human secondHuman = new Human("Sheldon", 30, "Caucasian", "Blue", 189f);
        Human thirdHuman = new Human("Amy", 70f);

        System.out.println(firstHuman.name);
        System.out.println(secondHuman.name);
        System.out.println(thirdHuman.name);
    }
}