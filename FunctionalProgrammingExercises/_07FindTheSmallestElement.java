package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestElement = (List<Integer> e) -> {
            int min = Integer.MAX_VALUE;
            for (int num : e) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        };

        int lastIndex = numbers.lastIndexOf(smallestElement.apply(numbers));
        System.out.println(lastIndex);
    }
}
