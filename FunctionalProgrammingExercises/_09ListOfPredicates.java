package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Predicate<Integer> predicate = (e -> {
            for (int num : numbers) {
                if (e == 0) {
                    continue;
                }
                if (e % num != 0) {
                    return false;
                }
            }
            return true;
        });
        for (int i = 1; i <= n; i++) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
