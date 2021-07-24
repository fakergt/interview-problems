package com.company;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        System.out.println("Write a number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("is number palindrome ?: " + isPalindrome(number));

    }

    public static boolean isPalindrome(final int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remains = palindrome % 10;
            reverse = reverse * 10 + remains;
            palindrome = palindrome / 10;
        }

        return number == reverse;
    }
}
