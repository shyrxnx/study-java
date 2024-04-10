import java.util.Scanner;

public class CollectionOfPractices {

    static int option;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Pick Problem:");
            System.out.println("Problem 1:\n");
            System.out.println("Problem 2:\n");
            System.out.println("Problem 3:\n");
            System.out.println("Problem 4:\n");
            System.out.println("Problem 5:\n");
            System.out.println("Problem 6:\n");
            System.out.println("Problem 7:\n");
            System.out.println("Problem 8:\n");
            System.out.println("Problem 9:\n");
            System.out.println("Problem 10:\n");
            System.out.println("Enter choice (1-10, 0 to exit): ");
            option = sc.nextInt();
            if (option == 0) {
                System.out.println("Exiting...");
                break;
            }
            Menu();
        }
        sc.close();
    }

    public static void Menu() {
        switch (option) {
            case 1:
                ProblemOne();
                break;
            case 2:
                // Implement ProblemTwo();
                break;
            case 3:
                // Implement ProblemThree();
                break;
            case 4:
                // Implement ProblemFour();
                break;
            case 5:
                // Implement ProblemFive();
                break;
            case 6:
                // Implement ProblemSix();
                break;
            case 7:
                // Implement ProblemSeven();
                break;
            case 8:
                // Implement ProblemEight();
                break;
            case 9:
                // Implement ProblemNine();
                break;
            case 10:
                // Implement ProblemTen();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
                break;
        }
    }

    public static void ProblemOne() {
        Scanner in = new Scanner(System.in);
        double[][] grade = new double[3][3];
        String[] cate = {"OOP", "ComProg", "DSA"};

        for (int student = 0; student < 3; student++) {
            for (int cat = 0; cat < 3; cat++) {
                System.out.print("Enter grade for student " + (student + 1) + " in subject " + cate[cat] + ":  ");
                grade[student][cat] = in.nextDouble();
            }
            System.out.println();
        }

        System.out.println();

        for (int student = 0; student < 3; student++) {
            for (int cat = 0; cat < 3; cat++) {
                System.out.print("Student " + (student + 1) + " grade in subject " + cate[cat] + " is: " + grade[student][cat]);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Subject Averages: ");
        for (int i = 0; i < 3; i++) {
            System.out.println((grade[0][i] + grade[1][i] + grade[2][i]) / 3);
        }

        System.out.println();

        System.out.println("Student Averages: ");
        for (int i = 0; i < 3; i++) {
            System.out.println((grade[i][0] + grade[i][1] + grade[i][2]) / 3);
        }
    }
}
