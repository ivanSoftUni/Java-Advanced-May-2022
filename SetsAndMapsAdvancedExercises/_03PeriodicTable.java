package SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        Set<String> chemicalElements = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            chemicalElements.addAll(Arrays.asList(elements));
        }
        chemicalElements.stream()
                .sorted(String::compareTo)
                .forEach(e -> System.out.print(e + " "));
    }
}
