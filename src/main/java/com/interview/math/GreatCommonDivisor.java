package com.interview.math;

import java.util.Scanner;

public class GreatCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Print a and b");
        System.out.print("a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("b = ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("greatest common divisor is : "+ greatCommonDiv(a,b));

        System.out.println("greatest common divisor is strange  : "+ findGCD(a,b));
    }

    public static int greatCommonDiv(int a, int b){
        int i = Math.min(a, b);
        while(i>1){
            if (a % i == 0 && b %i == 0){
                return i;
            }
            i--;
        }
        return 1;
    }

    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
}
