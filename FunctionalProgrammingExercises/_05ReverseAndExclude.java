package FunctionalProgrammingExercises;

import java.util.*;
import java.util.stream.Collectors;

public class _05ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbers);
        numbers.stream()
                .filter(e -> e % n != 0)
                .forEach(e -> System.out.print(e + " "));

    }
}
