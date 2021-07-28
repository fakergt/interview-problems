package com.company;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        System.out.println("print scale number");
        int scale = new Scanner(System.in).nextInt();

        trianglePrint(scale);
        pyramidPattern(scale);
    }

    public static void trianglePrint(int scale) {
        System.out.println("Triangle");
        for (int i = 0; i < scale; i++) {
            System.out.print("* ".repeat(i + 1));
            System.out.println();
        }
    }

    public static void pyramidPattern(int scale) {
        System.out.println("Pyramid");
        for (int i = 0; i < scale; i++) {
            for (int j = 0; j < scale-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
