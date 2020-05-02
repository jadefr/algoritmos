# algoritmos
Coletânea de problemas lógicos

# Descrição
Este repositório apresenta as seguintes classes:
  * FizzBuzz
  * Factorial
  * StringManipulation

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

**1. isUnique**

     Verifica se uma string apresenta caracteres repetidos.
    
**2. checkPermutation**
   
    Verifica se duas strings são permutações uma da outra.
    
**3. urlifyWithHashMap(String string)**
 
    Utiliza um HashMap pra converter caracteres vazios em %20. Apresenta complexidade O(N^2).
   
**4. urlify(String string)**
 
    Mesmo método do anterior, porém com complexidade O(N).

