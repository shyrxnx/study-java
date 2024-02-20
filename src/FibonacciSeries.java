import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int number = getUserInput.nextInt();

        int firstTerm = 0, secondTerm = 1, nextTerm, i = 2;
        System.out.println("Fibonacci Series up to " + number + " terms: ");
        System.out.print(firstTerm + " " + secondTerm + " ");

        do {
            nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        } while (i < number);
    }
}
