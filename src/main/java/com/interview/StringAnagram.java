package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        System.out.println("Write first word: ");
        String first = new Scanner(System.in).nextLine();
        System.out.println("Write second word: ");
        String second = new Scanner(System.in).nextLine();

        System.out.println("First method");
        System.out.println("The words are "+isAnagram(first,second) + " anagram");


        System.out.println("Second method");
        System.out.println("The words are "+checkAnagramByDeleting(first,second) + " anagram");


    }

    private static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        return Arrays.equals(firstChar, secondChar);
    }

    private static boolean checkAnagramByDeleting(String first, String second){
        if (first.length() != second.length()) {
            return false;
        }
        StringBuilder secondBuilder = new StringBuilder(second);
        char[] firstChar = first.toCharArray();

        for (char c: firstChar){
            int i = secondBuilder.indexOf(""+c);
            if (i != -1){
                secondBuilder.deleteCharAt(i);
            } else {
                return false;
            }
        }
        return secondBuilder.length()==0;
    }
}
