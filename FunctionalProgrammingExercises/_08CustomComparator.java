package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        numbers.stream().filter(e -> e % 2 == 0).sorted((e1, e2) -> e1.compareTo(e2))
                .forEach(e -> System.out.print(e + " "));
        numbers.stream().filter(e -> e % 2 != 0).sorted((e1, e2) -> e1.compareTo(e2))
                .forEach(e -> System.out.print(e + " "));
    }
}
