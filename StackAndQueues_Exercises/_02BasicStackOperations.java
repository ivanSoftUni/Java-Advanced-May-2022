package StackAndQueues_Exercises;

import com.sun.jdi.Value;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int elementToPush = input[0];
        int elementToPop = input[1];
        int numberToSearch = input[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < elementToPush; i++) {
            stack.push(scanner.nextInt());
        }
        for (int j = 0; j < elementToPop; j++) {
            stack.pop();
        }
        if (stack.contains(numberToSearch)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                int minNumber = Integer.MAX_VALUE;
                for (int i = 0; i < stack.size(); i++) {
                    int currentNum = stack.peek();
                    if (minNumber > stack.pop()) {
                        minNumber = currentNum;
                    }
                }
                System.out.println(minNumber);
            }
        }
    }
}
