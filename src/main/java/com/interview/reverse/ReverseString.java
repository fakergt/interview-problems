package com.interview.reverse;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Add a string to reverse: ");
        String string = new Scanner(System.in).nextLine();

        System.out.println(reverse(string));
    }

    public static String reverse(String string){
        StringBuilder reverse = new StringBuilder();
        for (int i=string.length(); i>0; i--){
            reverse.append(string.charAt(i-1));
        }
        return reverse.toString();
    }
}
