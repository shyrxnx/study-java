
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Brix");
        Cat cat1 = new Cat("MingMing");
        Bird bird1 = new Bird("Tweety");

        Animal[] animals = {dog1, cat1, bird1};

        for (Animal i : animals) {
            System.out.println(i.toString());
        }
    }
}