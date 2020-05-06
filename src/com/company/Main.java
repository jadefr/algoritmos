package com.company;

import com.company.hackerrank.HackerRank;
import com.company.stringmanipulation.StringManipulation;

import java.util.ArrayList;
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

        List<Integer> listA = new ArrayList<>();
        listA.add(17);
        listA.add(28);
        listA.add(30);

        List<Integer> listB = new ArrayList<>();
        listB.add(99);
        listB.add(16);
        listB.add(8);

        hackerRank.compareTripletsWithList(listA, listB);


    }
}
