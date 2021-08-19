package com.interview.math;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.print("1 2 3");
        for (int i = 4; i < 20; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(" " + i);
            }
        }

        System.out.print("\n1 ");
        for (int i = 0; i < 20; i++) {
            if (i!=0 && i!=1 && isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
