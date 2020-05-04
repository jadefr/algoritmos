package com.company;

import com.company.sorting.Sorting;
import com.company.stringmanipulation.StringManipulation;

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
        stringManipulation.compressString("aaaaabbbccccccdef");
//        stringManipulation.excludeDuplicates("aaaabbcdeeeffgggghijj");
    }
}
