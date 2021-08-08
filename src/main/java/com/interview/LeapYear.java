package com.interview;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Current year is :" + year);
        System.out.println("Add your year of choice: ");
        int secondYear = new Scanner(System.in).nextInt();

        if (isLeapYear(year)) {
            System.out.println("year " + year + " is a Leap Year");
        } else {
            System.out.println("year " + year + " it's not a Leap year");
        }

        if (isLeapYear(secondYear)) {
            System.out.println("year " + secondYear + " is a Leap Year");
        } else {
            System.out.println("year " + secondYear + " it's not a Leap year");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }
}
