package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] line = scanner.nextLine().toCharArray();
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (int i = 0; i < line.length; i++) {
            char currentSymbol = line[i];
            countMap.putIfAbsent(currentSymbol, 0);
            countMap.put(currentSymbol, countMap.get(currentSymbol) + 1);
        }
        countMap.entrySet().stream().sorted((k1, k2) -> k1.getKey().compareTo(k2.getKey()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue() + " time/s"));

    }
}
