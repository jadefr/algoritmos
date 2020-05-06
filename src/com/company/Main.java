package com.company;

import com.company.hackerrank.HackerRank;
import com.company.stringmanipulation.StringManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.printFizzBuzz();

//        Factorial factorial = new Factorial();
//        int value = factorial.getFactorial(5);
//        System.out.println(value);

//        Sorting sorting = new Sorting();
//        int[] array = {9, 14, 3, 2, 43, 11, 58, 22};
//        sorting.printInsertionSort(array);

        StringManipulation stringManipulation = new StringManipulation();
//        stringManipulation.isUnique("abbab");
//        stringManipulation.isUnique("abcdefgh");
//        stringManipulation.checkPermutation("abcabc", "aabbcc");
//        stringManipulation.checkPermutation("abcabc", "ajjjjjjj");
//        String urlified1 = stringManipulation.urlifyWithHashMap("hello world hello world");
//        System.out.println(urlified1);
//        String urlified2 = stringManipulation.urlifyWithHashMap("helloworldhelloworld");
//        System.out.println(urlified2);
//        String urlify = stringManipulation.urlify("helloworld  ");
//        System.out.println(urlify);
//        System.out.println(stringManipulation.isPalindrome("omississimo"));
//        System.out.println(stringManipulation.isPermutationAPalindrome("aaaaaa"));
//        System.out.println(stringManipulation.isOneAway("abcd", "abcd"));
//        stringManipulation.compressString("aaaaabbbccccccdefaaaa");
//        stringManipulation.excludeDuplicates("aaaabbcdeeeffgggghijj");

        HackerRank hackerRank = new HackerRank();
//        int[] array = {2, 5, 10};
//        System.out.println(hackerRank.getSimpleArraySum(array));

//        int[] a = {17, 28, 30};
//        int[] b = {99, 16, 8};
//        hackerRank.printCompareTriplets(a, b);

//        List<Integer> listA = new ArrayList<>();
//        listA.add(17);
//        listA.add(28);
//        listA.add(30);
//        System.out.println(Collections.max(listA));
//        List<Integer> listB = new ArrayList<>();
//        listB.add(99);
//        listB.add(16);
//        listB.add(8);
//        hackerRank.compareTripletsWithList(listA, listB);

//        long longA = 1234567890;
//        int intA = 1234567890;
//        long longB = 999999999999999999L;
//        String sB = String.valueOf(longB);
//        System.out.println(sB.length());
//        System.out.println(sB.charAt(6));

//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("lorem", 5);
//        hashMap.put("ipsum", 10);
//        hashMap.put("fac ut ardeat cor meum", 15);
//        System.out.println(Collections.max(hashMap.values()));

        long x = 10000;
        long y = 205;
        long z = 55;
        long[] array = {x, y, z};
        hackerRank.sumBigNumbers(array);
    }
}
