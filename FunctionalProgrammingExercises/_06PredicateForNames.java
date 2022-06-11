package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        names.stream().filter(e -> e.length() <= maxLength).forEach(System.out::println);

    }

}
