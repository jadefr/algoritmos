# algoritmos
Coletânea de problemas lógicos

# Tech Stack
Java

# Descrição
Este repositório apresenta as seguintes classes:
  * FizzBuzz
  * Factorial
  * StringManipulation
  * Sorting

# FizzBuzz
Problema clássico de lógica, que pede que se imprima números de 0 a 100. 

Caso o número seja múltiplo de 3, imprime-se _fizz_; caso seja múltiplo de 5, imprime-se _buzz_; e caso seja múltiplo de ambos, imprime-se _fizzbuzz_

http://wiki.c2.com/?FizzBuzzTest

# Factorial
Dado um inteiro _n_, retorna-se seu fatorial.

Fórmula:
    
    n! = n*(n-1)!
    
    0! = 1

Foi utilizada uma pilha de recursão.

# StringManipulation
Compreende os seguintes métodos:

**1. isUnique(String string)**

     Verifica se uma string apresenta caracteres repetidos.
     Complexidade: O(N)
     Utiliza uma estrutura adicional
    
**2. checkPermutation(String a, String b)**
   
    Verifica se duas strings são permutações uma da outra.
    Complexidade: O(N)
    Utiliza uma estrutura adicional
    
**3. urlifyWithHashMap(String string)**
 
    Utiliza um HashMap pra converter caracteres vazios em %20.
    Apresenta complexidade O(N^2).
   
**4. urlify(String string)**
 
    Mesmo método do anterior, porém com complexidade O(N).

**5. isPalindrome(String string)**

    Verifica se a string é um palíndromo.
    Apresenta complexidade O(N).
    
**6. isPermutationAPalindrome(String string)**
    
    Verifica se uma dada string é uma permutação de um palíndromo.
    Pior caso: O(N^3)
    Melhor caso: O(N)
    
**7. isOneAway(String a, String b)**
    
    There are three types of edits that can be performed on strings: insert a character,
    remove a character, or replace a character. Given two strings, write a function to check if they are
    one edit (or zero edits) away.
    
    Pior caso (i.e., replace): O(N)
    Melhor caso (i.e., remoção ou adição): O(1)
    
**8. compressString(String string)**
    
     Implement a method to perform basic string compression using the counts
     of repeated characters. For example, the string aabcccccaaa would become a2blc5a3.
     
     Complexidade: O(N)
    
# Sorting
Dado um array de inteiros, faz-se sua ordenação de acordo com a abordagem Insertion Sort

