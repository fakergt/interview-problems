package com.company;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("Write your sentence: ");
        String sentence = new Scanner(System.in).nextLine();

        System.out.println(reverseString(sentence));
    }

    private static String reverseString(String sentence) {
//        StringBuilder reversed= new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = words.length; i > 0; i--) {
            reversed.append(words[i - 1] + " ");
        }
        return reversed.toString();
    }
}
