package com.interview.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringAlghoritms {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("ala"));
    }

    private static boolean isAnagram(String first, String second) {
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        if (firstChar.length != secondChar.length) {
            return false;
        }

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);
        return Arrays.equals(firstChar, secondChar);
    }

    private static boolean isAnagramMap(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        Map<Character, Integer> firstWord = getMapCharacters(first);
        Map<Character, Integer> secondWord = getMapCharacters(second);
        return firstWord.equals(secondWord);
    }

    private static Map<Character, Integer> getMapCharacters(String word) {
        Map<Character, Integer> countCharacter = new HashMap<>();
        for (char c : word.toCharArray()) {
            countCharacter.put(c, countCharacter.getOrDefault(c, 0) + 1);
        }
        return countCharacter;
    }


    private static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString().equals(s);
    }

    private static boolean isPalindromeCharacters(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString().equals(s);
    }

    private static String longestPalindromic(String s) {
        String longest = "";
        StringBuilder currentLongest = new StringBuilder(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            currentLongest.append(s.charAt(i));
            if (currentLongest.length() > 1 && !isPalindrome(currentLongest.toString())) {
                currentLongest = new StringBuilder();
                continue;
            }
            if (currentLongest.length() > longest.length()) {
                longest = currentLongest.toString();
            }
        }
        return longest;
    }


    private static boolean uniqueCharacters(String s){
        StringBuilder word = new StringBuilder();
        for (char c : s.toCharArray()){
            if (word.toString().contains(String.valueOf(c))){
                return false;
            }
            word.append(c);
        }
        return true;
    }

}
