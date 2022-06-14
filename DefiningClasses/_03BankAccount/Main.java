package _03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccountsMap = new HashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String output = null;
            String[] input = line.split("\\s+");
            String command = input[0];
            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();
                bankAccountsMap.put(id, bankAccount);
                output = "Account ID" + id + " created";
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(input[1]);
                int amount = Integer.parseInt(input[2]);
                BankAccount bankAccount = bankAccountsMap.get(id);
                if (bankAccount != null) {
                    bankAccount.deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                }else {
                    System.out.println("Account does not exist");
                }
            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(input[1]);
                BankAccount.setInterestRare(interest);

            } else {
                int id = Integer.parseInt(input[1]);
                int years = Integer.parseInt(input[2]);
                BankAccount bankAccount = bankAccountsMap.get(id);
                if (bankAccount != null) {
                    output = String.format("%.2f", bankAccount.getInterest(years));
                } else {
                    output = "Account does not exist";
                }
            }

            if (output != null) {
                System.out.println(output);
            } else {

            }


            line = scanner.nextLine();
        }


    }
}
