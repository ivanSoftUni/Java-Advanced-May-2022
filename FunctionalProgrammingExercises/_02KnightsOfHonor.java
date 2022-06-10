package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");

        Consumer<String> consumer = e -> System.out.println("Sir " + e);

        Arrays.stream(line).forEach(consumer);

    }
}
