package com.company;

import com.company.factorial.Factorial;
import com.company.fizzbuzz.FizzBuzz;
import com.company.unique.Unique;

public class Main {

    public static void main(String[] args) {

//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.printFizzBuzz();

//        Factorial factorial = new Factorial();
//        int value = factorial.getFactorial(5);
//        System.out.println(value);

        Unique unique = new Unique();
        unique.isUnique("abbab");
        unique.isUnique("abcdefgh");

    }
}
