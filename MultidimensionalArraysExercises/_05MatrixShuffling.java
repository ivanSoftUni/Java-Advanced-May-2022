package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = readMatrix(scanner, rows, cols);

        String commandParts = scanner.nextLine();
        while (!commandParts.equals("END")) {
            String[] command = commandParts.split("\\s+");
            if (command[0].equals("swap") && command.length == 5) {
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);
                if (isInBounds(row1, col1, matrix) && isInBounds(row2, col2, matrix)) {
                    String firstElement = matrix[row1][col1];
                    String secondElement = matrix[row2][col2];
                    matrix[row1][col1] = secondElement;
                    matrix[row2][col2] = firstElement;
                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            commandParts = scanner.nextLine();
        }


    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String s : strings) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(int row, int col, String[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static boolean isOutOfBounds(int row, int col, String[][] matrix) {

        return !isInBounds(row, col, matrix);
    }

    private static String[][] readMatrix(Scanner scanner, int rows, int cols) {
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[row] = arr;
        }
        return matrix;
    }
}
