import java.util.Scanner;

public class Main {

    // Dynamic polymorphism is a process or mechanism in which a call to an overridden
    // method is to resolve at runtime rather than compile-time.

    // We can achieve dynamic polymorphism by using the method overriding.
    // Method overriding is when a child class has the same method as declared in the parent class
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);

        Animal animal1;

        System.out.print("Pick your pet:\n1 - Cat\n2 - Dog\nEnter choice: ");
        int choice = getUserInput.nextInt();

        if (choice == 1) {
            animal1 = new Cat();
            animal1.speak();
        } else if (choice == 2) {
            animal1 = new Dog();
            animal1.speak();
        } else {
            animal1 = new Animal();
            System.out.println("Invalid input!");
            animal1.speak();
        }
    }
}