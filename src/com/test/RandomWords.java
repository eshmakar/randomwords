package com.test;

import java.util.Random;

public class RandomWords {
    private static final Random r = new Random();
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//БУКВЫ
    private static final String glasnye = "aioeyu";//ГЛАСНЫЕ
    private static final char[] upperCases = alphabet.toCharArray();
    private static final char[] lowerCases = alphabet.toLowerCase().toCharArray();
    private static final char[] vowels = glasnye.toCharArray();

    private void randomWordsResult(int countDigits, int countWords) {//КОЛ-ВО БУКВ И КОЛ-ВО СЛОВ
        for (int j = 0; j < countWords; j++) {
            StringBuilder ch = new StringBuilder();
            ch.append(upperCases[r.nextInt(alphabet.length())]);
            for (int i = 0; i < countDigits; i++) {
                ch.append(vowels[r.nextInt(glasnye.length())]);
                ch.append(lowerCases[r.nextInt(alphabet.length())]);
            }
            System.out.println(ch.substring(0, countDigits));
        }
    }

    public static void main(String[] args) {
        RandomWords r0 = new RandomWords();
        r0.randomWordsResult(6, 100);

    }
}
