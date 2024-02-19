import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int player, randomizer;
        String computerMove = null, playerMove = null;

        Scanner userInput = new Scanner(System.in);
        Random randomInt = new Random();
        randomizer = randomInt.nextInt(0, 3);
        // System.out.println(randomInt.nextInt(0 ,3));

        System.out.println("Choices:\n0 - Rock\n1 - Paper\n2 - Scissor");
        System.out.print("Enter your move: ");
        player = userInput.nextInt();

        if (randomizer == 0) {
            computerMove = "rock";
        } else if (randomizer == 1) {
            computerMove = "paper";
        } else if (randomizer == 2) {
            computerMove = "scissor";
        }

        if (player == 0) {
            playerMove = "rock";
        } else if (player == 1) {
            playerMove = "paper";
        } else if (player == 2) {
            playerMove = "scissor";
        }

        System.out.println("Player picked " + playerMove + "!");
        System.out.println("Computer picked " + computerMove + "!");

        if (randomizer == 0 && player == 0) {
            System.out.println("It's a tie!");
        } else if (randomizer == 1 && player == 1) {
            System.out.println("It's a tie!");
        } else if (randomizer == 2 && player == 2) {
            System.out.println("It's a tie!");
        }  else if (randomizer == 0 && player == 1) {
            System.out.println("You won!");
        }  else if (randomizer == 0 && player == 2) {
            System.out.println("Computer won!");
        } else if (randomizer == 1 && player == 0) {
            System.out.println("Computer won!");
        } else if (randomizer == 1 && player == 2) {
            System.out.println("You won!");
        } else if (randomizer == 2 && player == 0) {
            System.out.println("You won!");
        } else if (randomizer == 2 && player == 1) {
            System.out.println("Computer won!");
        }
    }
}
