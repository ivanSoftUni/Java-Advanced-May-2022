package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, String> phoneBook = new LinkedHashMap<>();

        while (!line.equals("search")) {
            String[] info = line.split("-");
            String name = info[0];
            String phoneNumber = info[1];
//            phoneBook.putIfAbsent(name, phoneNumber);
            phoneBook.put(name, phoneNumber);

            line = scanner.nextLine();
        }

        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")) {
            if (phoneBook.containsKey(searchName)) {
                System.out.println(searchName + " -> " + phoneBook.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }
            searchName = scanner.nextLine();
        }

    }
}
