package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Set<String> parking = new LinkedHashSet<>();
        while (!line.equals("END")) {
            String[] input = line.split(", ");
            String direction = input[0];
            String carNumber = input[1];
            if (direction.equals("IN")) {
                parking.add(carNumber);
            } else {
                parking.remove(carNumber);
            }
            line = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String number : parking) {
                System.out.println(number);
            }
        }
    }
}
