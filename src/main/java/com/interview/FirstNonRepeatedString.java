package com.interview;

import java.util.Scanner;

public class FirstNonRepeatedString {
    public static void main(String[] args) {
        System.out.println("Add your word: ");
        String word = new Scanner(System.in).nextLine();

        System.out.println("First non repeated character in the above word is : " + getFirstNonRepeated(word));

    }

    private static Character getFirstNonRepeated(String word) {
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count=0;
            for (int j = 0; j < chars.length; j++) {
                if (i==j){
                    continue;
                }
                if (chars[i]==chars[j]){
                    count++;
                }
            }
            if (count==0){
                return chars[i];
            }
        }
        return null;
    }
}
