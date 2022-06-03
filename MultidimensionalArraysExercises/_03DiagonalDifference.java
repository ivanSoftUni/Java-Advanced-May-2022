package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMAtrix(scanner, size);
        int firstDiagonal = firstDiagonalSum(matrix);
        int secondDiagonal = secondDiagonalSum(matrix);
        System.out.println(Math.abs(firstDiagonal - secondDiagonal));
    }

    private static int secondDiagonalSum(int[][] matrix) {
        int sum = 0;
        int col = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            sum += matrix[row][col];
            col++;
        }
        return sum;
    }

    private static int firstDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][row];
        }
        return sum;
    }

    private static int[][] readMAtrix(Scanner scanner, int size) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        return matrix;
    }
}
