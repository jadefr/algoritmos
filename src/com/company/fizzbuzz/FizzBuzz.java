package com.company.fizzbuzz;

/**
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 */
public class FizzBuzz {
    public void printFizzBuzz() {
        System.out.println("0");
        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 != 0) ) {
                System.out.println("fizz");
            }
            else if ((i % 5 == 0) && (i % 3 != 0)) {
                System.out.println("buzz");
            }
            else if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

