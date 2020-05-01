package com.company;

import com.company.stringmanipulation.StringManipulation;

public class Main {

    public static void main(String[] args) {

//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.printFizzBuzz();

//        Factorial factorial = new Factorial();
//        int value = factorial.getFactorial(5);
//        System.out.println(value);

        StringManipulation stringManipulation = new StringManipulation();
//        stringManipulation.isUnique("abbab");
//        stringManipulation.isUnique("abcdefgh");

        stringManipulation.checkPermutation("abcabc", "aabbcc");
        stringManipulation.checkPermutation("abcabc", "ajjjjjjj");
    }
}
