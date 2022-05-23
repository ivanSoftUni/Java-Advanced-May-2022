package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {
            int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            switch (command[0]) {
                case 1:
                    stack.push(command[1]);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }
        }

    }

}
