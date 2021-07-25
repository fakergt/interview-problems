package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Add a number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("is number Armstrong ?: " + isArmstrong(number));

    }

    public static boolean isArmstrong(final int number) {
        int n = number;
        double armstrong = 0;
        while (n != 0) {
            int remains = n % 10;
            armstrong = armstrong + Math.pow(remains,3);
            n = n / 10;
        }
        return armstrong == number;
    }
}
