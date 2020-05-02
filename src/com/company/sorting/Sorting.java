package com.company.sorting;

public class Sorting {

    private void insertionSort(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;

            while ( (j > -1) && ( array[j] > key ) ) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void printInsertionSort(int[] array) {
        insertionSort(array);
        for (int i: array) {
            System.out.println(i);
        }
    }
}
