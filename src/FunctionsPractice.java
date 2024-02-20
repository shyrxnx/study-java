public class FunctionsPractice {
    public static void main(String[] args) {
        int result = addNumbers(5, 10);
        System.out.println("<----- Add Numbers Method ----->");
        System.out.println("Sum is: " + result);
        System.out.println();
        String evenOdd = evenOrOdd(5);
        System.out.println("<----- Even or Odd Method ----->");
        System.out.println("The number is: " + evenOdd);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
