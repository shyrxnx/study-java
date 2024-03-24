public class Bird extends Animal {

    double wingspan;

    Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    void fly() {
        System.out.println("The bird is flying...");
    }

}
