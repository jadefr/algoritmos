package com.company.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HackerRank {

    /**
     * Given an array of integers, find the sum of its elements.
     */
    public int getSimpleArraySum (int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
        }
        return sum;
    }


    /**
     * Given two int arrays, compare each's element
     */
    private int[] compareTriplets(int[] a, int[] b) {
        int[] array = {0, 0};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                array[0]++;
            }
            else if(a[i] < b[i]) {
                array[1]++;
            }
        }

        return array;
    }

    /**
     * Print the compareTriplets method
     */
    public void printCompareTriplets(int[] a, int[] b) {
        int[] array = compareTriplets(a, b);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * Similar to compareTriplets, but made with list
     */
    public void compareTripletsWithList(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        list.add(0);    // primeiro elemento
        list.add(0);    // segundo elemento

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                list.set(0, (list.get(0) + 1));
            }
            else if (a.get(i) < b.get(i)) {
                list.set(1, (list.get(1) + 1));
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }

}
