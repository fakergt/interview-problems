package com.company;

public class Fibonacci {
    public static void main(String[] args) {
//        for (int i = 1; i < 20; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
        fibonacci2();
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void fibonacci2(){
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n2);

        for (int i=1; i<10;i++){
            n3 = n1+n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
