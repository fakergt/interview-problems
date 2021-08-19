package com.interview;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 50;
        int last = arr.length - 1;

        binarySearch(arr, key, last);
    }

    private static void binarySearch(int[] arr, int key, int last) {
        int first = 0;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("element found at position " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("not found");
        }
    }
}
