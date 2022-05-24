package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int queueElement = input[0];
        int elementToRemove = input[1];
        int elementToSearch = input[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i < elementToRemove; i++) {
            queue.poll();
        }
        if (queue.contains(elementToSearch)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
