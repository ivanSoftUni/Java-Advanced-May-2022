package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimension[0];
        int cols = dimension[1];

        String[][] matrix = fillingMatrix(rows, cols);

        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String element : strings) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static String[][] fillingMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];
        char startLetter = 'a';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String currentElement = "" + startLetter + (char) (startLetter + col) + startLetter;
                matrix[row][col] = currentElement;
            }
            startLetter = (char) (startLetter + 1);
        }
        return matrix;
    }
}
