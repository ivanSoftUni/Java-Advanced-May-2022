package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<List<String>> printer = list -> {
            if (list.isEmpty()) {
                System.out.println("Nobody is going to the party!");
            } else {

                System.out.printf("%s are going to the party!%n", String.join(", ", guests));
            }
        };

        String line = scanner.nextLine();

        while (!line.equals("Party!")) {
            String[] commandParts = line.split("\\s+");
            String command = commandParts[0];
            String predicateType = commandParts[1];
            String predicateArg = commandParts[2];

            if (command.equals("Remove")) {
                guests.removeIf(getPredicate(predicateType, predicateArg));
            } else if (command.equals("Double")) {
                for (int i = 0; i < guests.size(); i++) {
                    String guest = guests.get(i);
                    if (getPredicate(predicateType, predicateArg).test(guest)) {
                        guests.add(i++, guest);
                    }
                }
            }
            line = scanner.nextLine();
        }
        Collections.sort(guests);
        printer.accept(guests);
    }

    private static Predicate<String> getPredicate(String predicateType, String predicateArg) {
        switch (predicateType) {
            case "StartsWith":
                return element -> element.startsWith(predicateArg);
            case "EndsWith":
                return element -> element.endsWith(predicateArg);
            case "Length":
                return element -> element.length() == Integer.parseInt(predicateArg);
            default:
                return element -> false;
        }

    }
}
