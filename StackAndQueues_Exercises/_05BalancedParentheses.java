package StackAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] brackets = scanner.nextLine().toCharArray();

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();

        boolean balanced = true;
        for (char currentBracket : brackets) {
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBrackets.push(currentBracket);
            } else if ((currentBracket == ')' || currentBracket == '}' || currentBracket == ']')) {
                if (openBrackets.isEmpty()){
                    balanced = false;
                    break;
                }
                    char open = openBrackets.pop();
                    if (open == '(' && currentBracket != ')'){
                        balanced = false;
                        break;
                    } else if (open == '{' && currentBracket != '}'){
                        balanced = false;
                        break;
                    }else if (open == '[' && currentBracket != ']'){
                        balanced = false;
                        break;
                    }
            }
        }
        if (balanced && openBrackets.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
