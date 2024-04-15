import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter how many rows: ");
        int rows = userInput.nextInt();

        System.out.print("Enter how many columns: ");
        int cols = userInput.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int j = 0; j < rows; j++) {
            System.out.println("\nEnter the values of the " + (j + 1) + " row: ");
            for (int i = 0; i < cols; i++) {
                System.out.print("Enter content of " + (i + 1) + " element: ");
                matrix[j][i] = userInput.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix: ");
        printMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrix(matrix);
        System.out.println("\nRotated Matrix: ");
        printMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotateMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotateMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }
        return rotateMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
