package com.company;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Add your number: ");
        int n = new Scanner(System.in).nextInt();

        getRoot(n);
    }

    private static void getRoot(int n) {
        System.out.println("square root of " + n + " is " + Math.pow(n, 0.5));
    }
}
