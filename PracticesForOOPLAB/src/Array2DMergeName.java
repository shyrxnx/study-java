import java.util.Scanner;

public class Array2DMergeName {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int num = userInput.nextInt();

        String[][] names = new String[num][2];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter first name for " + (i + 1) + " value: ");
            names[i][0] = userInput.next();

            System.out.print("Enter last name for " + (i + 1) + " value: ");
            names[i][1] = userInput.next();
        }

        System.out.println("\n\nThe full names is/are: ");
        for (String[] name : names) {
            String fullName = mergeArray(name[0], name[1]);
            System.out.println(fullName);
        }

    }

    public static String mergeArray(String first_name, String last_name) {
        return first_name + " " + last_name;
    }
}
