import java.util.Scanner;
import java.util.Random;

//Write a Java program for a simple number guessing game. Generate a random number between 1 and 100,
//then prompt the user to guess the number. Continue prompting until the user guesses correctly.
public class GuessTheNumber {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(1, 101);

        Scanner userInput = new Scanner(System.in);

        int tries = 5;
        int guessCounter = 0;

        System.out.println("I'm thinking of a number between 1 - 100 (You have " + tries + " tries left)");

        while (tries > 0) {
            System.out.print("Enter your guess: ");
            int playerGuess = userInput.nextInt();

            if (playerGuess > randomNumber) {
                System.out.println("Your guess is too high!");
                tries--;
                guessCounter++;
                System.out.println("You have " + tries + " left");
            } else if (playerGuess < randomNumber) {
                System.out.println("Your guess is too low!");
                tries--;
                guessCounter++;
                System.out.println("You have " + tries + " left");
            } else {
                guessCounter++;
                System.out.println("Congratulations! You guess the number in " + guessCounter + " tries.");
            }
        }
        System.out.println("Game over! You have no tries left.");
    }
}
