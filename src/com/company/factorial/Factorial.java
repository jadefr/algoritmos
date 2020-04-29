package com.company.factorial;

/**
 * Dado um inteiro n, retornar seu fatorial
 *   fórmula: n! = n*(n-1)!
 *   0! = 1
 */
public class Factorial {
    public int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
