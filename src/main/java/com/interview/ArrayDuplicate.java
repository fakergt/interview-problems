package com.interview;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3, 2, 5};

        System.out.println("Initial array :");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n removed duplicates");
        for (int i : returnArray(array)) {
            System.out.print(i + " ");
        }
    }

    public static int[] returnArray(int[] array) {
        int[] anotherArray = array;
        for (int i = 0; i < anotherArray.length; i++) {
            for (int j = 0; j < anotherArray.length; j++) {
                if (i == j) {
                    continue;
                }
                if (anotherArray[i] == anotherArray[j]) {
                    anotherArray = removeTheElement(anotherArray, j);
                }
            }
        }
        return anotherArray;
    }

    public static int[] removeTheElement(int[] arr,
                                         int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}
