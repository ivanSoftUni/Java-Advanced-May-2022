package _02Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Car car;
            if (input.length == 1){
                String brand = input[0];
             car = new Car(brand);
            }else {
                String brand = input[0];
                String model = input[1];
                int power = Integer.parseInt(input[2]);

               car = new Car(brand,model,power);
            }

            System.out.println(car.carInfo());
        }


    }
}
