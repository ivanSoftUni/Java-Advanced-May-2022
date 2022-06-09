package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] setsSizes = scanner.nextLine().split("\\s+");
        int setOneSize = Integer.parseInt(setsSizes[0]);
        int setTwoSize = Integer.parseInt(setsSizes[1]);

        Set<Integer> firstSet = new LinkedHashSet<>(setOneSize);
        Set<Integer> secondSet = new LinkedHashSet<>(setTwoSize);
        for (int i = 0; i < setOneSize; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            firstSet.add(num);
        }
        for (int j = 0; j < setTwoSize; j++) {
            int num = Integer.parseInt(scanner.nextLine());
            secondSet.add(num);
        }

        if (firstSet.size() < secondSet.size()) {
            for (Integer number : firstSet) {
                if (secondSet.contains(number)) {
                    System.out.print(number + " ");
                }
            }
        } else {
            for (Integer number : secondSet) {
                if (firstSet.contains(number)) {
                    System.out.print(number + " ");
                }
            }
        }

    }
}
