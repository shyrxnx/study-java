import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num_one, num_two, sum;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num_one = inputScanner.nextInt();
        System.out.print("Enter the second number: ");
        num_two = inputScanner.nextInt();

        sum = num_one + num_two;
        System.out.println("The sum is: " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is an even number!");
        } else {
            System.out.println("The sum is an odd number!");
        }
    }
}