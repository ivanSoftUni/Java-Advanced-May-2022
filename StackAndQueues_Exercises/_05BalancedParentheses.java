package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] brackets = scanner.nextLine().toCharArray();

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        ArrayDeque<Character> closedBrackets = new ArrayDeque<>();
        for (int i = 0; i < brackets.length; i++) {
            char currentBracket = brackets[i];
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBrackets.push(brackets[i]);
            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                closedBrackets.offer(brackets[i]);
            }
        }
        boolean isNotBalanced = true;
        if (openBrackets.size() != closedBrackets.size() && (openBrackets.size() > 0) && (closedBrackets.size() > 0)) {
            isNotBalanced = false;
        } else {
            while (openBrackets.size() != 0){
                char open = openBrackets.pop();
                char closed = closedBrackets.poll();
                if ((open == '(' && closed == ')') || (open == '{' && closed == '}') || (open == '[' && closed == ']')) {
                } else {
                    isNotBalanced = false;
                    break;
                }
            }
        }
        if (isNotBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
