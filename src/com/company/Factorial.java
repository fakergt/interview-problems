package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Add the factorial number: ");
        int number = new Scanner(System.in).nextInt();

        factor(number);
        System.out.println("recursive factor :" + factorRecursive(number));
    }

    public static void factor(final int number) {
        int factor = 1;
        for (int i = 0; i < number; i++) {
            factor *= (i + 1);
        }
        System.out.println(factor);
    }

    public static int factorRecursive(int number) {
        if (number > 1) {
            return number * factorRecursive(number-1);
        } else {
            return 1;
        }
    }


}
