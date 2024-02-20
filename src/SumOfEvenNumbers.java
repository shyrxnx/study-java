import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = getUserInput.nextInt();

        int sum = 0;

        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all even numbers between 1 to " + number + " is: " + sum);
    }
}
