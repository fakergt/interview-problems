package com.interview.reverse;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 2};
        int[] reversedArray = reverseArray(array);

        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }

    private static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = tmp;
        }
        return array;
    }
}
