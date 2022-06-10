package SetsAndMapsAdvancedExercises;

import java.util.*;

public class _07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<Integer>> players = new LinkedHashMap<>();
        while (!line.equals("JOKER")) {
            String[] playerInfo = line.split(": ");
            String name = playerInfo[0];
            String[] cards = playerInfo[1].split(", ");
            List<Integer> cardValueList = new LinkedList<>();

            players.putIfAbsent(name, new LinkedList<>());
            for (int i = 0; i < cards.length; i++) {
                int cardValue = 1 ;
                if (Character.isDigit(cards[i].charAt(0))) {
                    int firstDigit;
                    int secondCardValue;
                    if (cards[i].length() == 3) {
                        firstDigit = Integer.parseInt("" + cards[i].charAt(0) + cards[i].charAt(1));
                        secondCardValue = getSecondLetterValue(cards[i].charAt(2));
                    } else {
                        firstDigit = Integer.parseInt("" + cards[i].charAt(0));
                        secondCardValue = getSecondLetterValue(cards[i].charAt(1));
                    }
                    cardValue = firstDigit * secondCardValue;
                } else {
                    switch (cards[i].charAt(0)) {
                        case 'J':
                            cardValue = 11 * getSecondLetterValue(cards[i].charAt(1));
                            break;
                        case 'Q':
                            cardValue = 12 * getSecondLetterValue(cards[i].charAt(1));
                            break;
                        case 'K':
                            cardValue = 13 * getSecondLetterValue(cards[i].charAt(1));
                            break;
                        case 'A':
                            cardValue = 14 * getSecondLetterValue(cards[i].charAt(1));
                            break;
                    }
                }
                cardValueList = players.get(name);
                if (!cardValueList.contains(cardValue)) {
                    cardValueList.add(cardValue);
                }
            }
            players.put(name, cardValueList);
            line = scanner.nextLine();
        }
        printPlayers(players);
        System.out.println();
    }

    private static void printPlayers(Map<String, List<Integer>> players) {
        players.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue().stream().mapToInt(Integer::valueOf).sum()));
    }

    private static int getSecondLetterValue(char card) {
        int secondCardValue = 0;

        switch (card) {
            case 'S':
                secondCardValue = 4;
                break;
            case 'H':
                secondCardValue = 3;
                break;
            case 'D':
                secondCardValue = 2;
                break;
            case 'C':
                secondCardValue = 1;
                break;
        }
        return secondCardValue;
    }
}
