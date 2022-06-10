package SetsAndMapsAdvancedExercises;

import java.util.Scanner;

public class _06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (fixEmail(email)) {
                System.out.println(name + " -> " + email);
            }
            name = scanner.nextLine();
        }
    }

    private static boolean fixEmail(String email) {
        int lastDotIndex = email.lastIndexOf(".");
        String domain = email.substring(lastDotIndex + 1);
        return (!(domain.equals("us") || domain.equals("uk") || domain.equals("com")));

    }
}
