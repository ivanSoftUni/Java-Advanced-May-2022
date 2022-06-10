package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Function<int[], Integer> function = (int[] arr) -> {
            int min = Integer.MAX_VALUE;
            for (int element : arr) {
                if (element < min) {
                    min = element;
                }
            }
            return min;
        };

        System.out.println(function.apply(numbers));
    }

    public static Integer main(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
