import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = new int[] {11, 22, 33};

        //Iterate over the array
        System.out.println("Original iterate over an array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Enhanced version of iterating over an array
        System.out.println();
        System.out.println("Enhanced iterate over an array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] family = {"Shyrine", "Sheena", "Rosita", "Manolito"};
        System.out.println();
        for (String member : family) {
            System.out.println(member);
        }

        //Get the length of an array
        System.out.println("\nThe length of the array numbers is: " + numbers.length);
        System.out.println("The length of the array family is: " + family.length);

        //Get the length of a string
        String myName = "Shyrine Salvador";
        System.out.println("The length of the string myName is: " + myName.length());

        //Search for an item in an array using for loop
        for (String members : family) {
            if ("Shyrine".equals(members)) {
                System.out.println("There's a match!");
            } else {
                System.out.println("Not found.");
            }
            break;
        }

        //Sort a String array alphabetically
        System.out.println();
        System.out.println("The family array before sorting: " + Arrays.toString(family));
        Arrays.sort(family);
        System.out.println("The family array after sorting: " + Arrays.toString(family));
    }
}
