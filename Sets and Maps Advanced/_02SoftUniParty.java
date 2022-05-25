package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Set<String> guests = new TreeSet<>();
        while (!line.equals("PARTY")) {
            boolean isVIP = Character.isDigit(line.charAt(0));
            guests.add(line);
            line = scanner.nextLine();
        }
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            guests.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
