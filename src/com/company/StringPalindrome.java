package com.company;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String string = sc.nextLine();

        System.out.println("Is the following String a palindrome ?: " + isStringPalindrome(string));
    }

    public static boolean isStringPalindrome(final String string){
        char[] stringChars = string.toCharArray();
        StringBuilder reverseString = new StringBuilder();
        for (int i=string.length(); i>0; i--){
            reverseString.append(stringChars[i - 1]);
        }
        return reverseString.toString().equals(string);
    }
}
