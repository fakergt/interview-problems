package com.interview.reverse;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Add your number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println(returnReverseNumber(number));
    }

    private static int returnReverseNumber(int number) {
        int n = number;
        int reverse = 0;
        while (n != 0) {
            int remains = n % 10;
            reverse = reverse * 10 + remains;
            n = n / 10;
        }
        return reverse;
    }
}
