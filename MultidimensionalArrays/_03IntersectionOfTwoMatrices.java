package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(scanner, rows, cols);
        char[][] secondMatrix = readMatrix(scanner, rows, cols);

        char[][] resultMatrix = compareMatrices(firstMatrix, secondMatrix);

        for (char[] matrix : resultMatrix) {
            for (char c : matrix) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    private static char[][] compareMatrices(char[][] firstMatrix, char[][] secondMatrix) {

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                char firstMatrixElement = firstMatrix[row][col];
                char secondMatrixElement = secondMatrix[row][col];
                if (firstMatrixElement != secondMatrixElement) {
                    firstMatrix[row][col] = '*';
                }

            }
        }
        return firstMatrix;
    }

    private static char[][] readMatrix(Scanner scanner, int rows, int cols) {

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }
        return matrix;
    }
}
