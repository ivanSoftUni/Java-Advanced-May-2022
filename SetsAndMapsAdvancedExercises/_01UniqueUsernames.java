package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            usernames.add(line);
        }

        for (String username : usernames) {
            System.out.println(username);
        }

    }
}
