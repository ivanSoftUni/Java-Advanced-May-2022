package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;


public class _02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int numberToSearch = Integer.parseInt(scanner.nextLine());

        searchingNumberInMatrix(matrix, numberToSearch);
    }

    private static void searchingNumberInMatrix(int[][] matrix, int numberToSearch) {
        boolean isNotFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];
                if (numberToSearch == currentNumber) {
                    System.out.println(row + " " + col);
                    isNotFound = true;
                }
            }
        }
        if (!isNotFound) {
            System.out.println("not found");
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] rowsCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        return matrix;
    }
}
