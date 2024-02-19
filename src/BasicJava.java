import java.util.Scanner;

public class BasicJava {
    public static void main(String[] args) {
        int number_one, number_two, sum, difference, product;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("This program calculates the sum, difference, and product of two inputs!\n");
        System.out.print("Enter the first number: ");
        number_one = inputScanner.nextInt();
        System.out.print("Enter the second number: ");
        number_two = inputScanner.nextInt();

        sum = number_one + number_two;
        difference = number_one - number_two;
        product = number_one * number_two;

        System.out.println("\nThe results of: " + number_one + " and " + number_two);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}