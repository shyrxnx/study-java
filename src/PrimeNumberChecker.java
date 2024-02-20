import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("This program checks if a number is a prime number or not...\n");
        System.out.print("Enter a number to check: ");
        int number = getUserInput.nextInt();

        int divisor = 2;
        boolean checkIfPrime = true;

        while (divisor <= number / 2) {
            if (number % divisor == 0) {
                checkIfPrime = false;
                break;
            }
            divisor++;
        }

        if (number <= 1) {
            checkIfPrime = false;
        }

        if (checkIfPrime) {
            System.out.println("The number " + number + " is a prime number!");
        } else {
            System.out.println("The number " + number + " is not a prime number!");
        }
    }
}
