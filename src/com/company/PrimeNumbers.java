package com.company;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.print("1 2 3");
        for (int i=4; i<20;i++){
            int count =0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.print(" "+i);
            }
        }
    }
}
