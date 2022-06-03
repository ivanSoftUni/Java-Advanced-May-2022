package MultidimensionalArraysExercises;

import java.util.Scanner;

public class _01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        int[][] matrix = new int[size][size];

        switch (input[1]) {
            case "A":
                matrix = readMatrixA(size);
                break;
            case "B":
                matrix = readMatrixB(size);
                break;
        }
        for (int[] ints : matrix) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrixB(int size) {
        int i = 1;
        int[][] matrix = new int[size][size];
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = i;
                    i++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = i;
                    i++;
                }
            }

        }
        return matrix;
    }

    private static int[][] readMatrixA(int size) {
        int i = 1;
        int[][] matrix = new int[size][size];
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = i;
                i++;
            }
        }
        return matrix;
    }
}
