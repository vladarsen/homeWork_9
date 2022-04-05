package com.vladarsenjtev;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int randomInt = new Random().nextInt(words.length);
        Scanner scanner = new Scanner(System.in);
        String userCase;
        System.out.println("Компьютер загадал слово " + words[randomInt]);
        do {
            System.out.println("Отгадайте слово: ");
            userCase = scanner.next();
            gameGuessNWord(userCase, words[randomInt]);
        } while (!userCase.equals(words[randomInt]));
    }

    public static void gameGuessNWord(String userCase, String word) {
        String clientWord = userCase;
        String compWord = word;
        StringBuilder security = new StringBuilder("###############");

        if (clientWord.equals(compWord)) {
            System.out.println("Вы победили. Компютер загадал слово " + compWord);
        } else {
            for (int i = 0; i < clientWord.length(); i++) {
                if (clientWord.charAt(i) == compWord.charAt(i)) {
                    security.append(clientWord.charAt(i));
                }
            }
            System.out.println(security);
            System.out.println("Попробуйте снова");
        }
    }
}