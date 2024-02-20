import java.util.Scanner;

// Write a Java program to calculate the factorial of a given non-negative integer using a for loop.
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = getUserInput.nextInt();

        int factorial = 1;
        for (int x = number; x >= 1; x--) {
            factorial *= x;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
