import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        String firstString, secondString, placeholder;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        firstString = inputScanner.next();
        System.out.print("Enter the second string: ");
        secondString = inputScanner.next();

        placeholder = firstString;
        firstString = secondString;
        secondString = placeholder;

        System.out.println("The content of the first variable now is: " + firstString);
        System.out.println("The content of the second variable now is: " + secondString);
    }
}
